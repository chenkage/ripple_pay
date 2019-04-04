<%@ page pageEncoding="UTF-8" %>
<%
response.setCharacterEncoding("UTF-8");
response.setContentType("application/json;charset=UTF-8");
com.ejar.domain.bean.common.BaseResponse exceptionResp = new com.ejar.domain.bean.common.BaseResponse();
exceptionResp.setStatus(com.ejar.domain.enums.ResponseStatus.ERROR);
com.ejar.common.objects.expt.BusinessException ex = (com.ejar.common.objects.expt.BusinessException)request.getAttribute("exception");
exceptionResp.setErrorCode(ex.getErrorCode());
String exMessage = ex.getMessage();
if (exMessage != null && exMessage.indexOf("dubbo") >= 0) {
    exMessage = "服务器繁忙, 请稍后重试2";
}
exceptionResp.setErrorMsg(exMessage);
String message = com.alibaba.fastjson.JSON.toJSONString(exceptionResp);
response.getWriter().write(message);
%>