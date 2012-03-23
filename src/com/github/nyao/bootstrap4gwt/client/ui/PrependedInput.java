package com.github.nyao.bootstrap4gwt.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.Widget;

public class PrependedInput extends Composite implements HasText {

    private static PrependedInputUiBinder uiBinder = GWT.create(PrependedInputUiBinder.class);

    interface PrependedInputUiBinder extends UiBinder<Widget, PrependedInput> {
    }
    
    @UiField InlineLabel addOn;
    @UiField TextBox input;

    public PrependedInput() {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    public void setId(String id) {
        getElement().setAttribute("id", id);
    }

    public void setAddOn(String s) {
        addOn.setText(s);
    }

    @Override
    public String getText() {
        return input.getText();
    }

    @Override
    public void setText(String text) {
        input.setText(text);
    }
}
