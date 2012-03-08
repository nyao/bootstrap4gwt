package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickHandler;

import com.google.gwt.safehtml.shared.SafeHtml;

public class Button extends com.google.gwt.user.client.ui.Button {

    protected Button(Element element) {
        super(element.<Element> cast());
        ButtonElement.as(element);
    }

    public Button() {
        super(Document.get().createPushButtonElement());
        addStyleName("btn");
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

}
