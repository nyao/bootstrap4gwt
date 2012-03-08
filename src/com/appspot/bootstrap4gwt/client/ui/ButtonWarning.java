package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickHandler;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.Button;

public class ButtonWarning extends Button {

    protected ButtonWarning(Element element) {
        super(element.<Element> cast());
        ButtonElement.as(element);
    }

    public ButtonWarning() {
        super(Document.get().createPushButtonElement());
        addStyleName("btn btn-warning");
    }
    
    public ButtonWarning(SafeHtml html) {
        this(html.asString());
    }
    
    public ButtonWarning(String html) {
        this();
        setHTML(html);
    }

    public ButtonWarning(SafeHtml html, ClickHandler handler) {
      this(html.asString(), handler);
    }

    public ButtonWarning(String html, ClickHandler handler) {
      this(html);
      addClickHandler(handler);
    }

}
