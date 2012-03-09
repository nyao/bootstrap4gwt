package com.appspot.bootstrap4gwt.client.ui;

public enum ButtonState {

    Default("btn"),
    Active("active"),
    Disabled("disabled"),
    ;
    
    private String value;

    private ButtonState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
