import com.base.redis.RedisClientTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.io.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-redis.xml")
public class RedisTest{
    @Resource
    private RedisClientTemplate redisClientTemplate;

    @Test
    public void testSave(){
        String key = "10086";
        String val = "中国移动";
        String r = redisClientTemplate.set(key,val);
        System.out.println(r);
    }

    @Test
    public void testFind(){
        String key = "10087";
        String result = redisClientTemplate .get(key);
        System.out.println(result);
    }

    @Test public void testDel(){
//        String key = "10086";
//        long l = redisClientTemplate.(key);
//        System.out.println(l);
    }

    @Test
    public void testlpush(){
        String key = "test_1";
        Modle m ;
        long result = 0;
        for (int i = 0; i < 10; i++) {
            m = new Modle();
            m.setId(i);
            m.setName("张三"+i);
            try {
                result = redisClientTemplate.lpush(objectToBytes(key),objectToBytes(m));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(result);
    }

    @Test
    public void testrpop(){
        String key = "test_1";
        Modle result = new Modle();
        try {
            result = (Modle)bytesToObject(redisClientTemplate.rpop(objectToBytes(key)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result.getName());
    }

    /**对象转byte[]
     * @param obj
     * @return
     * @throws IOException
     */
    public static byte[] objectToBytes(Object obj) throws Exception{
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(obj);
        byte[] bytes = bo.toByteArray();
        bo.close();
        oo.close();
        return bytes;
    }

    /**byte[]转对象
     * @param bytes
     * @return
     * @throws Exception
     */
    public static Object bytesToObject(byte[] bytes) throws Exception{
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        ObjectInputStream sIn = new ObjectInputStream(in);
        return sIn.readObject();
    }

}