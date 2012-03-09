package com.appspot.bootstrap4gwt.client.ui;

public enum ButtonSize {

    Large("btn-large"),
    Small("btn-small"),
    Mini("btn-mini"),
    ;
    
    private String value;

    private ButtonSize(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
