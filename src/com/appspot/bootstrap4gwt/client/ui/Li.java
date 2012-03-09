package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class Li extends ComplexPanel {
    public Li() {
        setElement(Document.get().createLIElement());
    }
    
    @Override
    public void add(Widget child) {
        add(child, getElement());
    }
    
    public void setText(String text) {
        getElement().setInnerText(text);
    }
}
