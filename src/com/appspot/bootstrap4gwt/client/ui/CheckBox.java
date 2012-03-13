package com.appspot.bootstrap4gwt.client.ui;

public class CheckBox extends com.google.gwt.user.client.ui.CheckBox {

    public CheckBox() {
    }

    public void setId(String id) {
        getElement().getElementsByTagName("input").getItem(0).setAttribute("id", id);
    }
    
    public void setDisabled(String s) {
        getElement().getElementsByTagName("input").getItem(0).setAttribute("disabled", s);
    }
    
}
