package com.github.nyao.bootstrap4gwt.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class RadioButton extends Composite {

    private static RadioButtonUiBinder uiBinder = GWT.create(RadioButtonUiBinder.class);

    interface RadioButtonUiBinder extends UiBinder<Widget, RadioButton> {
    }
    
    @UiField com.google.gwt.user.client.ui.RadioButton button;

    public RadioButton() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    public void setLabel(String s) {
        button.setText(s);
    }
    
    public void setName(String name) {
        button.setName(name);
    }
}
