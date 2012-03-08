package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickHandler;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.Button;

public class ButtonDanger extends Button {

    protected ButtonDanger(Element element) {
        super(element.<Element> cast());
        ButtonElement.as(element);
    }

    public ButtonDanger() {
        super(Document.get().createPushButtonElement());
        addStyleName("btn btn-danger");
    }
    
    public ButtonDanger(SafeHtml html) {
        this(html.asString());
    }
    
    public ButtonDanger(String html) {
        this();
        setHTML(html);
    }

    public ButtonDanger(SafeHtml html, ClickHandler handler) {
      this(html.asString(), handler);
    }

    public ButtonDanger(String html, ClickHandler handler) {
      this(html);
      addClickHandler(handler);
    }

}
