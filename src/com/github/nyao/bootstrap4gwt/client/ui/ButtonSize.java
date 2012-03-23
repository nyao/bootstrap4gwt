package com.github.nyao.bootstrap4gwt.client.ui;

public enum ButtonSize {

    Default("btn"),
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
