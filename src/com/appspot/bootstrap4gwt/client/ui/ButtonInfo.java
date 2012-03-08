package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickHandler;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.Button;

public class ButtonInfo extends Button {

    protected ButtonInfo(Element element) {
        super(element.<Element> cast());
        ButtonElement.as(element);
    }

    public ButtonInfo() {
        super(Document.get().createPushButtonElement());
        addStyleName("btn btn-info");
    }
    
    public ButtonInfo(SafeHtml html) {
        this(html.asString());
    }
    
    public ButtonInfo(String html) {
        this();
        setHTML(html);
    }

    public ButtonInfo(SafeHtml html, ClickHandler handler) {
      this(html.asString(), handler);
    }

    public ButtonInfo(String html, ClickHandler handler) {
      this(html);
      addClickHandler(handler);
    }

}
