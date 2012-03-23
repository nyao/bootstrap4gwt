package com.github.nyao.bootstrap4gwt.client.ui;

public enum TextBoxAlternateSize {

    Default("input"),
    Mini("input-mini"),
    Small("input-small"),
    Medium("input-medium"),
    ;
    
    private String value;

    private TextBoxAlternateSize(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
