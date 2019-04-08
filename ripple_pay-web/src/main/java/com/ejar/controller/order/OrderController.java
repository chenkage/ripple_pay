package com.ejar.controller.order;

import com.ejar.common.annotation.LoggerProcessTime;
import com.ejar.common.permission.AuthToken;
import com.ejar.domain.bean.common.BaseResponse;
import com.ejar.domain.bean.order.OrderInfoBean;
import com.ejar.domain.model.CurrencyOrder;
import com.ejar.persistence.syslog.SystemControllerLog;
import com.ejar.service.order.OrderInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderInfoService orderInfoService;

	@PostMapping("/queryOrderList.do")
	// 登录注解
//	@AuthToken
	// 方法执行时间日志记录注解
	@LoggerProcessTime
	// 方法访问参数数据库入库注解
	@SystemControllerLog(description="订单列表")
	public BaseResponse<List<CurrencyOrder>> queryOrderList(@RequestBody OrderInfoBean orderInfo) {
		BaseResponse<List<CurrencyOrder>> response = new BaseResponse<List<CurrencyOrder>>();
//		try{
		response.setData(orderInfoService.queryOrderList(orderInfo));
		response.setStatus(com.ejar.domain.enums.ResponseStatus.SUCCESS);
//		}catch (Exception e){
//			response.setErrorMsg(e.getMessage());
//			response.setStatus(com.ejar.domain.enums.ResponseStatus.ERROR);
//		}
//		int a = 1/0;
		return response;
	}
}
