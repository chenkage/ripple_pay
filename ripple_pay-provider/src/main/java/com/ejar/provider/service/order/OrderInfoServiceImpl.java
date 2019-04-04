
package com.ejar.provider.service.order;

import com.ejar.common.objects.expt.BusinessException;
import com.ejar.domain.bean.order.OrderInfoBean;
import com.ejar.domain.model.CurrencyOrder;
import com.ejar.provider.manager.OrderInfoManager;
import com.ejar.service.order.OrderInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("orderInfoService")
public class OrderInfoServiceImpl implements OrderInfoService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private OrderInfoManager orderInfoManager;

    @Override
    public List<CurrencyOrder> queryOrderList(OrderInfoBean orderInfo) throws BusinessException {
        return orderInfoManager.queryOrderList(orderInfo);
    }
}
