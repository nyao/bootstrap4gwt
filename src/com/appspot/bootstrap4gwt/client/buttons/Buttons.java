package com.appspot.bootstrap4gwt.client.buttons;

import com.appspot.bootstrap4gwt.client.ui.Button;
import com.appspot.bootstrap4gwt.client.ui.ButtonType;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Buttons extends Composite {

    private static ButtonsUiBinder uiBinder = GWT.create(ButtonsUiBinder.class);

    interface ButtonsUiBinder extends UiBinder<Widget, Buttons> {
    }

    public Buttons() {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    @UiField Button sample;

    @UiHandler("defaultButton")
    void onDefaultClick(ClickEvent event) {
        sample.setType(ButtonType.Default);
        sample.setText(sample.getType().name());
    }

    @UiHandler("primary")
    void onPrimaryClick(ClickEvent event) {
        sample.setType(ButtonType.Primary);
        sample.setText(sample.getType().name());
    }

    @UiHandler("info")
    void onInfoClick(ClickEvent event) {
        sample.setType(ButtonType.Info);
        sample.setText(sample.getType().name());
    }

    @UiHandler("success")
    void onSuccessClick(ClickEvent event) {
        sample.setType(ButtonType.Success);
        sample.setText(sample.getType().name());
    }

    @UiHandler("warning")
    void onWarningClick(ClickEvent event) {
        sample.setType(ButtonType.Warning);
        sample.setText(sample.getType().name());
    }

    @UiHandler("danger")
    void onDangerClick(ClickEvent event) {
        sample.setType(ButtonType.Danger);
        sample.setText(sample.getType().name());
    }

    @UiHandler("inverse")
    void onInverseClick(ClickEvent event) {
        sample.setType(ButtonType.Inverse);
        sample.setText(sample.getType().name());
    }
}
