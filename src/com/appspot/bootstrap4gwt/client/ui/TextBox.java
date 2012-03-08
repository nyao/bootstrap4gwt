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
    
    public void setId(String id) {
        getElement().setAttribute("id", id);
    }
    
    public void setPlaceholder(String s) {
        getElement().setAttribute("placeholder", s);
    }
    
    public void setDisabled(String s) {
        getElement().setAttribute("disabled", s);
    }
    
    public void setWarning(String s) {
        Element elm = this.getElement().getParentElement().getParentElement();
        elm.addClassName("warning");
    }
    
    public void setError(String s) {
        Element elm = getElement().getParentElement().getParentElement();
        elm.addClassName("error");
    }
    
    public void setSuccess(String s) {
        Element elm = getElement().getParentElement().getParentElement();
        elm.addClassName("success");
    }
}
