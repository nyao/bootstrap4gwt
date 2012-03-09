package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.Element;

public class TextBox extends com.google.gwt.user.client.ui.TextBox {

    public TextBox() {
        super();
        setStyleName("");
    }

    protected TextBox(Element element) {
        super(element);
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
