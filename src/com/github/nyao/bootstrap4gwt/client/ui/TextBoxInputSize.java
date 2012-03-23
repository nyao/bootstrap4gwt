package com.github.nyao.bootstrap4gwt.client.ui;

public enum TextBoxInputSize {

    Large("input-xlarge"),
    ;
    
    private String value;

    private TextBoxInputSize(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
