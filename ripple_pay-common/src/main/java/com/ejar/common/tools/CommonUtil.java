package com.ejar.common.tools;

import java.util.Collection;
import java.util.Map;

/**
 * @author shishun.wang
 * @version 1.0
 * @date 2019/2/18 16:52
 * @describe
 */
public class CommonUtil {
	
	public static final boolean isDigit(String str) {
		if (isEmpty(str)) {
			return false;
		}
		try {
			// Ignore Sonar check for checking the varchar/char is a double
			// value
			Double.valueOf(str);// NOSONAR
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static final boolean isLong(String str) {
		if (isEmpty(str)) {
			return false;
		}
		try {
			// Ignore Sonar check for checking the varchar/char is a long
			// value
			Long.valueOf(str);// NOSONAR
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static final boolean isInteger(String str) {
		if (isEmpty(str)) {
			return false;
		}
		try {
			// Ignore Sonar check for checking the varchar/char is a Integer
			// value
			Integer.valueOf(str);// NOSONAR
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static final boolean isHexLong(String str) {
		if (isEmpty(str)) {
			return false;
		}
		try {
//			Long.parseUnsignedLong(str, 16);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static final boolean isEmpty(Collection<? extends Object> value) {
		if (value == null || value.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static final boolean isAnyEmpty(Collection<? extends Object> value) {
		if (value == null || value.isEmpty()) {
			return true;
		}
		for (Object item : value) {
			if (isEmpty(item)) {
				return true;
			}
		}
		return false;
	}
	
	public static final boolean isEmpty(Map<? extends Object, ? extends Object> value) {
		if (value == null || value.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static final boolean isEmpty(Object value) {
		if (value != null && value instanceof String) {
			return isEmpty((String) value);
		} else if (value != null && value instanceof Collection) {
			return isEmpty((Collection<?>) value);
		} else if (value != null && value instanceof Map) {
			return isEmpty((Map<?, ?>) value);
		}
		return value == null;
	}
	
	public static final boolean isEmpty(String value) {
		if (value == null || value.length() == 0) {
			return true;
		}
		return false;
	}
	
	public static final boolean isEmpty(Object[] value) {
		if (value == null || value.length < 1) {
			return true;
		}
		return false;
	}
	
	public static final boolean isNotEmpty(Object value) {
		return !isEmpty(value);
	}
	
	public static final boolean isAllEmpty(Object... value) {
		if (isEmpty(value)) {
			return true;
		}
		for (Object item : value) {
			if (!isEmpty(item)) {
				return false;
			}
		}
		return true;
	}
	
	public static final boolean isAnyEmpty(Object... value) {
		if (isEmpty(value)) {
			return true;
		}
		for (Object item : value) {
			if (isEmpty(item)) {
				return true;
			}
		}
		return false;
	}
}
