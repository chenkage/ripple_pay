package com.ejar.common;

import com.ejar.common.objects.expt.BussinessException;

import java.util.Collection;
import java.util.Map;

public abstract class Asserts {

    public static BussinessException getThrowException(Class<? extends BussinessException> exClass, String message, Object... formats) {
        try {
            return (message == null || message.trim().length() == 0) ? exClass.getConstructor().newInstance():
                    exClass.getConstructor(String.class).newInstance(String.format(message, formats));
        } catch (Exception e) {
            return new BussinessException(String.format("%s with %s-parameters of the constructor not found",
                    exClass.getName(), (message == null || message.trim().length() == 0) ? "None":"String"));
        }
    }

    public static void isTrue(boolean expression) throws BussinessException {
        isTrue(expression, null);
    }

    public static void isTrue(boolean expression, String code, String message, Object... formats) throws BussinessException {
        if(!expression) {
            BussinessException exception = getThrowException(BussinessException.class, message, formats);
            exception.setCode(code);
            throw exception;
        }
    }

    public static void isTrue(boolean expression, String message, Object... formats) throws BussinessException {
        if(!expression) {
            throw getThrowException(BussinessException.class, message, formats);
        }
    }

    public static void isNull(Object object) throws BussinessException {
        isNull(object, null);
    }

    public static void isNull(Object object, String code, String message, Object... formats) throws BussinessException {
        if(object != null) {
            BussinessException exception = getThrowException(BussinessException.class, message, formats);
            exception.setCode(code);
            throw exception;
        }
    }

    public static void isNull(Object object, String message, Object... formats) throws BussinessException {
        if(object != null) {
            throw getThrowException(BussinessException.class, message, formats);
        }
    }

    public static void notNull(Object object) throws BussinessException {
        notNull(object, null);
    }

    public static void notNull(Object object, String code, String message, Object... formats) throws BussinessException {
        if(object == null) {
            BussinessException exception = getThrowException(BussinessException.class, message, formats);
            exception.setCode(code);
            throw exception;
        }
    }

    public static void notNull(Object object, String message, Object... formats) throws BussinessException {
        if(object == null) {
            throw getThrowException(BussinessException.class, message, formats);
        }
    }

    public static void hasLength(String text) throws BussinessException {
        hasLength(text, null);
    }

    public static void hasLength(String text, String message, Object... formats) throws BussinessException {
        if(text == null || text.trim().length() == 0) {
            throw getThrowException(BussinessException.class, message, formats);
        }
    }

    public static void hasLength(String text, String code, String message, Object... formats) throws BussinessException {
        if(text == null || text.trim().length() == 0) {
            BussinessException exception = getThrowException(BussinessException.class, message, formats);
            exception.setCode(code);
            throw exception;
        }
    }

    public static void notEmpty(Object[] array) throws BussinessException {
        notEmpty(array, null);
    }

    public static void notEmpty(Object[] array, String message, Object... formats) throws BussinessException {
        if(array == null || array.length ==0) {
            throw getThrowException(BussinessException.class, message, formats);
        }
    }
    public static void isEmpty(Collection<?> collection, String code, String message, Object... formats) throws BussinessException {
        if(collection != null && !collection.isEmpty()) {
            BussinessException exception = getThrowException(BussinessException.class, message, formats);
            exception.setCode(code);
            throw exception;
        }
    }
    public static void isEmpty(Collection<?> collection, String message, Object... formats) throws BussinessException {
        if(collection != null && !collection.isEmpty()) {
            throw getThrowException(BussinessException.class, message, formats);
        }
    }

    public static void notEmpty(Collection<?> collection) throws BussinessException {
        notEmpty(collection, null);
    }

    public static void notEmpty(Collection<?> collection, String code, String message, Object... formats) throws BussinessException {
        if(collection == null || collection.isEmpty()) {
            BussinessException exception = getThrowException(BussinessException.class, message, formats);
            exception.setCode(code);
            throw exception;
        }
    }

    public static void notEmpty(Collection<?> collection, String message, Object... formats) throws BussinessException {
        if(collection == null || collection.isEmpty()) {
            throw getThrowException(BussinessException.class, message, formats);
        }
    }

    public static void notEmpty(Map<?, ?> map) throws BussinessException {
        notEmpty(map, null);
    }

    public static void notEmpty(Map<?, ?> map, String message, Object... formats) throws BussinessException {
        if(map == null || map.isEmpty()) {
            throw getThrowException(BussinessException.class, message, formats);
        }
    }

    public static void noNullElements(Object[] array) throws BussinessException {
        noNullElements(array, null);
    }

    public static void noNullElements(Object[] array, String message, Object... formats) throws BussinessException {
        if(array != null) {
            for (Object element : array) {
                if(element == null) {
                    throw getThrowException(BussinessException.class, message, formats);
                }
            }
        }
    }

    public static void isInstanceOf(Class<?> type, Object obj) throws BussinessException {
        isInstanceOf(type, obj, null);
    }

    public static void isInstanceOf(Class<?> type, Object obj, String message, Object... formats) throws BussinessException {
        notNull(type, "Type to check against must not be null");
        if(!type.isInstance(obj)) {
            throw getThrowException(BussinessException.class, message, formats);
        }
    }

    public static void isAssignable(Class<?> superType, Class<?> subType) throws BussinessException {
        isAssignable(superType, subType, null);
    }

    public static void isAssignable(Class<?> superType, Class<?> subType, String message, Object... formats) throws BussinessException {
        notNull(superType, "Type to check against must not be null");
        if(subType == null || !superType.isAssignableFrom(subType)) {
            throw getThrowException(BussinessException.class, message, formats);
        }
    }
}