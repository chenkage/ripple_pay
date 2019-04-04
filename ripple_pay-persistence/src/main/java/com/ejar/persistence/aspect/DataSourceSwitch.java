package com.ejar.persistence.aspect;

import com.ejar.persistence.datasource.DynamicRouteDataSource;

/**
 * <B>Description: 读写分离开关接口 </B><BR/>
 * <B>Copyright:Copyright(c)2018 by FORWAY R&D Corporation, Inc. All rights
 * reserved.</B><BR/>
 * @createtime May 29, 2018 11:38:15 PM
 * @version 1.0
 **/
public interface DataSourceSwitch {

    DynamicRouteDataSource.DataSourceType getSwitchTarget(String targetName);
}