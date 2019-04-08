package com.ejar.common.permission;

import com.auth0.jwt.interfaces.Claim;
import com.ejar.common.Asserts;
import com.ejar.common.constant.PublicKey;
import com.ejar.common.token.JwtToken;
import com.ejar.redis.RedisClientTemplate;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 权限验证切点类
 *
 * @author ChenXY
 */
@Aspect
@Component
public class AuthTokenAspect {

    private static final Logger logger = LoggerFactory.getLogger(AuthTokenAspect.class);

    @Resource
    private RedisClientTemplate redisClientTemplate;

    private HttpServletRequest request = null;

    /**
     * 层切入点
     */
    @Pointcut("@annotation(com.ejar.common.permission.AuthToken)")
    public void authTokenAspect() {

    }

    @Before("authTokenAspect()")
    public void doBefore(JoinPoint joinPoint) {
        request = getHttpServletRequest();
        String token = request.getHeader(PublicKey.KEY_USER_TOKEN);
        Asserts.notNull(token,"ERROR_CODE_01","token为空");

        // 获取用户id
        Map<String, Claim> userMap = JwtToken.getClaims(token);
        Asserts.notNull(userMap,"ERROR_CODE_01","token解析异常");
        String userId = userMap.get(PublicKey.KEY_USER_ID).asString();
        Asserts.notNull(userId,"ERROR_CODE_01","userId为空");

        String sessionId = PublicKey.KEY_USER_SESSION + userId;
        String value = redisClientTemplate.get(sessionId);
        Asserts.notNull(value,"ERROR_CODE_01","token无效");

        // 通过验证后，重置过期时间
        redisClientTemplate.expire(sessionId,PublicKey.TIMEOUT);
    }

    /**
     * @Description: 获取request
     * @param
     * @return HttpServletRequest
     */
    private static HttpServletRequest getHttpServletRequest(){
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes)ra;
        HttpServletRequest request = sra.getRequest();
        return request;
    }

}