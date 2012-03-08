package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class CheckBox extends Composite {

    private static CheckBoxUiBinder uiBinder = GWT.create(CheckBoxUiBinder.class);

    interface CheckBoxUiBinder extends UiBinder<Widget, CheckBox> {
    }
    
    @UiField com.google.gwt.user.client.ui.CheckBox checkBox;

    public CheckBox() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public void setValue(boolean v) {
        checkBox.setValue(v);
    }

    public void setId(String id) {
        getElement().getElementsByTagName("input").getItem(0).setAttribute("id", id);
    }
    
    public void setDisabled(String s) {
        getElement().getElementsByTagName("input").getItem(0).setAttribute("disabled", s);
    }
    
    public void setText(String s) {
        checkBox.setText(s);
    }
    
    public void setInline(boolean isInline) {
        if (isInline) getElement().getFirstChildElement().addClassName("inline");
    }
}
