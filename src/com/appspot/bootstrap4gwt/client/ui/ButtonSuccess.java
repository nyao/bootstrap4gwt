package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickHandler;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.Button;

public class ButtonSuccess extends Button {

    protected ButtonSuccess(Element element) {
        super(element.<Element> cast());
        ButtonElement.as(element);
    }

    public ButtonSuccess() {
        super(Document.get().createPushButtonElement());
        addStyleName("btn btn-success");
    }
    
    public ButtonSuccess(SafeHtml html) {
        this(html.asString());
    }
    
    public ButtonSuccess(String html) {
        this();
        setHTML(html);
    }

    public ButtonSuccess(SafeHtml html, ClickHandler handler) {
      this(html.asString(), handler);
    }

    public ButtonSuccess(String html, ClickHandler handler) {
      this(html);
      addClickHandler(handler);
    }

}
