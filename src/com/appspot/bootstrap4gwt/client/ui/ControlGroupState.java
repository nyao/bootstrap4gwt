package com.appspot.bootstrap4gwt.client.ui;

public enum ControlGroupState {

    Warning("warning"),
    Error("error"),
    Success("success"),
    ;
    
    private String value;

    private ControlGroupState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
