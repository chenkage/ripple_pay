
package com.ejar.provider.manager.impl;

import com.ejar.common.annotation.LoggerProcessTime;
import com.ejar.common.objects.expt.BusinessException;
import com.ejar.domain.bean.order.OrderInfoBean;
import com.ejar.domain.model.CurrencyOrder;
import com.ejar.persistence.datasource.DataSource;
import com.ejar.persistence.datasource.DynamicRouteDataSource;
import com.ejar.persistence.mapper.CurrencyOrderMapper;
import com.ejar.provider.manager.OrderInfoManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class OrderInfoManagerImpl implements OrderInfoManager {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Resource
	CurrencyOrderMapper currencyOrderMapper;

	@Override
	@LoggerProcessTime
	@DataSource(DynamicRouteDataSource.DataSourceType.READ_DATA_SOURCE)
	public List<CurrencyOrder> queryOrderList(OrderInfoBean orderInfo) throws BusinessException {
		return currencyOrderMapper.selectByExample(null);
	}
}
