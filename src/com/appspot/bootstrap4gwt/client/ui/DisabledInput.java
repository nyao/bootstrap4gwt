package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;

public class DisabledInput extends TextBox {

    public DisabledInput() {
        this(Document.get().createTextInputElement(), "input-xlarge disabled");
        setDisabled("");
    }

    protected DisabledInput(Element element) {
      super(element);
      assert InputElement.as(element).getType().equalsIgnoreCase("text");
    }

    DisabledInput(Element element, String styleName) {
      super(element);
      if (styleName != null) {
        setStyleName(styleName);
      }
    }
}
