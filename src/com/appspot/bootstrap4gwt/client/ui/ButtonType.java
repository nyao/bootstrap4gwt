package com.appspot.bootstrap4gwt.client.ui;

public enum ButtonType {

    Default("btn"),
    Primary("btn btn-primary"),
    Info("btn btn-infor"),
    Success("btn btn-success"),
    Warning("btn btn-warning"),
    Danger("btn btn-danger"),
    Inverse("btn btn-inverse"),
    ;
    
    private String value;

    private ButtonType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
