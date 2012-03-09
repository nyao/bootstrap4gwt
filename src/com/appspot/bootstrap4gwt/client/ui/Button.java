package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickHandler;

import com.google.gwt.safehtml.shared.SafeHtml;

public class Button extends com.google.gwt.user.client.ui.Button {

    private ButtonType type;
    private ButtonSize buttonSize;
    
    protected Button(Element element) {
        super(element.<Element> cast());
        ButtonElement.as(element);
    }

    public Button() {
        super(Document.get().createPushButtonElement());
        setStyleName("btn");
    }

    public Button(SafeHtml html) {
        this(html.asString());
    }

    public Button(String html) {
        this();
        setHTML(html);
    }

    public Button(SafeHtml html, ClickHandler handler) {
        this(html.asString(), handler);
    }

    public Button(String html, ClickHandler handler) {
        this(html);
        addClickHandler(handler);
    }
    
    public ButtonType getType() {
        return type;
    }

    public void setType(ButtonType type) {
        this.type = type;
        setButtonStyle();
    }
    
    public ButtonSize getButtonSize() {
        return buttonSize;
    }
    
    public void setButtonSize(ButtonSize size) {
        this.buttonSize = size;
        setButtonStyle();
    }
    
    private void setButtonStyle() {
        setStyleName("");
        if (this.type != null) addStyleName(this.type.getValue());
        if (this.buttonSize != null) addStyleName(this.buttonSize.getValue());
    }
}
