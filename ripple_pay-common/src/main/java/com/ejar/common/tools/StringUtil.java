package com.ejar.common.tools;

/**
 * @author shishun.wang
 * @version 1.0
 * @date 2019/2/19 15:47
 * @describe
 */
public class StringUtil extends CommonUtil{
	public static final boolean isBlank(String value) {
		if (isEmpty(value)) {
			return true;
		}
		if (value.trim().length() == 0) {
			return true;
		}
		return false;
	}
	
	public static final boolean isNotBlank(String value) {
		return !isBlank(value);
	}
	
	public static final boolean isBlankOrNull(String value) {
		if (isBlank(value)) {
			return true;
		}
		if ("null".equals(value.trim())) {
			return true;
		}
		return false;
	}
	
	public static final boolean isNotBlankOrNull(String value) {
		return !isBlankOrNull(value);
	}
}
