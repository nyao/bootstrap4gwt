package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;

public class TextBox extends com.google.gwt.user.client.ui.TextBox {

    public TextBox() {
        this(Document.get().createTextInputElement(), "input-xlarge");
    }

    protected TextBox(Element element) {
      super(element);
      assert InputElement.as(element).getType().equalsIgnoreCase("text");
    }

    TextBox(Element element, String styleName) {
      super(element);
      if (styleName != null) {
        setStyleName(styleName);
      }
    }
    
}
