package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickHandler;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.Button;

public class ButtonInverse extends Button {

    protected ButtonInverse(Element element) {
        super(element.<Element> cast());
        ButtonElement.as(element);
    }

    public ButtonInverse() {
        super(Document.get().createPushButtonElement());
        addStyleName("btn btn-inverse");
    }
    
    public ButtonInverse(SafeHtml html) {
        this(html.asString());
    }
    
    public ButtonInverse(String html) {
        this();
        setHTML(html);
    }

    public ButtonInverse(SafeHtml html, ClickHandler handler) {
      this(html.asString(), handler);
    }

    public ButtonInverse(String html, ClickHandler handler) {
      this(html);
      addClickHandler(handler);
    }

}
