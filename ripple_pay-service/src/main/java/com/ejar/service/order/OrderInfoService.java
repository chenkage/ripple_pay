
package com.ejar.service.order;

import com.ejar.common.objects.expt.BusinessException;
import com.ejar.domain.bean.order.OrderInfoBean;
import com.ejar.domain.model.CurrencyOrder;

import java.util.List;

public interface OrderInfoService {

    List<CurrencyOrder> queryOrderList(OrderInfoBean orderInfo) throws BusinessException;
}
