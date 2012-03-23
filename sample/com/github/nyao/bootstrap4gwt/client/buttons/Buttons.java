package com.github.nyao.bootstrap4gwt.client.buttons;

import com.github.nyao.bootstrap4gwt.client.ui.Button;
import com.github.nyao.bootstrap4gwt.client.ui.ButtonSize;
import com.github.nyao.bootstrap4gwt.client.ui.ButtonState;
import com.github.nyao.bootstrap4gwt.client.ui.ButtonType;
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

    @UiHandler("defaultType")
    void onDefaultClick(ClickEvent event) {
        sample.setType(ButtonType.Default);
    }

    @UiHandler("primary")
    void onPrimaryClick(ClickEvent event) {
        sample.setType(ButtonType.Primary);
    }

    @UiHandler("info")
    void onInfoClick(ClickEvent event) {
        sample.setType(ButtonType.Info);
    }

    @UiHandler("success")
    void onSuccessClick(ClickEvent event) {
        sample.setType(ButtonType.Success);
    }

    @UiHandler("warning")
    void onWarningClick(ClickEvent event) {
        sample.setType(ButtonType.Warning);
    }

    @UiHandler("danger")
    void onDangerClick(ClickEvent event) {
        sample.setType(ButtonType.Danger);
    }

    @UiHandler("inverse")
    void onInverseClick(ClickEvent event) {
        sample.setType(ButtonType.Inverse);
    }

    @UiHandler("defaultSize")
    void onDefaultSizeClick(ClickEvent event) {
        sample.setButtonSize(ButtonSize.Default);
    }

    @UiHandler("large")
    void onLargeClick(ClickEvent event) {
        sample.setButtonSize(ButtonSize.Large);
    }

    @UiHandler("small")
    void onSmallClick(ClickEvent event) {
        sample.setButtonSize(ButtonSize.Small);
    }

    @UiHandler("mini")
    void onMiniClick(ClickEvent event) {
        sample.setButtonSize(ButtonSize.Mini);
    }

    @UiHandler("defaultState")
    void ondefaultStateClick(ClickEvent event) {
        sample.setState(ButtonState.Default);
    }

    @UiHandler("disabled")
    void onDisbledClick(ClickEvent event) {
        sample.setState(ButtonState.Disabled);
    }

    @UiHandler("active")
    void onActiveClick(ClickEvent event) {
        sample.setState(ButtonState.Active);
    }
}
