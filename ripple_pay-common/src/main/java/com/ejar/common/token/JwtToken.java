package com.ejar.common.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class JwtToken {

    private static final Logger logger = LoggerFactory.getLogger(JwtToken.class);

    /**
     * 加密盐
     */
    private static final String KEY_SECRET = "8JHwKyNi,Q_AY$L{40]2tfvM%E.)D[szC*}T:+&m9~W5=u;jO#-Vc6o@`x/lS>qI^bU1'ZBd|kpFG?a3re<!nXhgR7(P";


    /**
     * 创建token
     * 说明：withHeader 头部
     * withClaim 承载
     * sign  加盐
     *
     * @param reqMap
     * @return
     * @throws Exception
     */
    public static String createToken(Map<String,Object> reqMap){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("alg", "HS256");
        map.put("typ", "JWT");
        JWTCreator.Builder builder = JWT.create();
        builder.withHeader(map);
        for (Map.Entry<String, Object> entry : reqMap.entrySet()) {
            builder.withClaim(entry.getKey(), entry.getValue().toString());
        }

        return builder.sign(Algorithm.HMAC256(KEY_SECRET));
    }

    public static Map<String, Claim> getClaims(String token) {
        Map<String, Claim>  result;

        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(KEY_SECRET))
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            result = jwt.getClaims();
        } catch (Exception e) {
            logger.warn("token verifyToken error:token=" + token , e);
            return null;
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
//        String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MzAwMDM1MTksInVzZXJJZCI6Mn0.RdbLIcJnev3gQWlSoBpatA4otTTnTL9ca5NMxAoOWks";
        Map req = new HashMap();
        req.put("userId",2L);
        req.put("userName","test");
        req.put("phone","13800111441");
        req.put("imgUrl","http://ssxsh.com/01.jpg");

        String token = createToken(req);
        System.out.println(token);
        System.out.println(getClaims(token));
    }
}