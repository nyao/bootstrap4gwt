package com.appspot.bootstrap4gwt.client.ui;

public enum TextBoxState {

    Disabled("uneditable-input"),
    ;
    
    private String value;

    private TextBoxState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
