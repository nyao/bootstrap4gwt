package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickHandler;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.Button;

public class ButtonPrimary extends Button {

    protected ButtonPrimary(Element element) {
        super(element.<Element> cast());
        ButtonElement.as(element);
    }

    public ButtonPrimary() {
        super(Document.get().createPushButtonElement());
        addStyleName("btn btn-primary");
    }
    
    public ButtonPrimary(SafeHtml html) {
        this(html.asString());
    }
    
    public ButtonPrimary(String html) {
        this();
        setHTML(html);
    }

    public ButtonPrimary(SafeHtml html, ClickHandler handler) {
      this(html.asString(), handler);
    }

    public ButtonPrimary(String html, ClickHandler handler) {
      this(html);
      addClickHandler(handler);
    }

}
