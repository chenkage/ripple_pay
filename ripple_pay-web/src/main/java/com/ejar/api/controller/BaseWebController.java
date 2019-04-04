package com.ejar.api.controller;

import com.auth0.jwt.interfaces.Claim;
import com.ejar.common.Asserts;
import com.ejar.common.constant.PublicKey;
import com.ejar.common.enums.ResponseEnum;
import com.ejar.common.token.JwtToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Slf4j
public class BaseWebController {
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

    protected Long getUserId(){
        String token = getToken();
        Map<String, Claim> userMap = JwtToken.getClaims(token);
        String userId = userMap.get(PublicKey.KEY_USER_ID).asString();
        Asserts.notNull(userId, ResponseEnum.ACCOUNT_NOEXISTS.getCode(),"userId为空");
        Long luserId =  Long.parseLong(userId);
        return luserId;
    }

    protected String getToken(){
        String token = getHttpServletRequest().getHeader(PublicKey.KEY_USER_TOKEN);
        Asserts.notNull(token,ResponseEnum.LOGIN_TIME_OUT.getCode(),"token为空");
        return token;
    }
}