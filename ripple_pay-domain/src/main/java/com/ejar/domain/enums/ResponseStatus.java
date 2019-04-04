package com.ejar.domain.enums;

public enum ResponseStatus implements java.io.Serializable {
    SUCCESS(0),
    ERROR(1);
    private int code;

    private ResponseStatus(int code) {
        this.code = code;
    }
}
