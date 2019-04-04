package com.ejar.persistence.datasource;

import com.ejar.common.objects.ThreadContext;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicRouteDataSource extends AbstractRoutingDataSource {
    public static final String THREAD_CONTEXT_DATA_SOURCE_KEY = "THREAD_CONTEXT_DATA_SOURCE_KEY";

    @Override
    protected Object determineCurrentLookupKey() {
        return ThreadContext.get(THREAD_CONTEXT_DATA_SOURCE_KEY);
    }

    public enum DataSourceType {
        READ_DATA_SOURCE("readDataSource"),
        WRITE_DATA_SOURCE("writeDataSource");
        private String typeName;

        public static DataSourceType fromValue(String typeName) {
            for (DataSourceType dataSourceType : values()) {
                if (dataSourceType.typeName.equals(typeName)) {
                    return dataSourceType;
                }
            }
            return null;
        }

        DataSourceType(String typeName) {
            this.typeName = typeName;
        }

        public String getTypeName() {
            return typeName;
        }
    }
}
