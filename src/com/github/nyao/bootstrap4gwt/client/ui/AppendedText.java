package com.github.nyao.bootstrap4gwt.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.Widget;

public class AppendedText extends Composite implements HasText {

    private static AppendedTextUiBinder uiBinder = GWT.create(AppendedTextUiBinder.class);

    interface AppendedTextUiBinder extends UiBinder<Widget, AppendedText> {
    }

    @UiField InlineLabel addOn;
    @UiField TextBox input;
    
    public AppendedText() {
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
