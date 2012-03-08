package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.i18n.client.HasDirection.Direction;
import com.google.gwt.i18n.shared.DirectionEstimator;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;

public class CheckBox extends com.google.gwt.user.client.ui.CheckBox {

    public CheckBox() {
      this(DOM.createInputCheck());
    }

    public CheckBox(SafeHtml label) {
      this(label.asString(), true);
    }

    public CheckBox(SafeHtml label, Direction dir) {
      this();
      setHTML(label, dir);
    }

    public CheckBox(SafeHtml label, DirectionEstimator directionEstimator) {
      this();
      setDirectionEstimator(directionEstimator);
      setHTML(label.asString());
    }

    public CheckBox(String label) {
      this();
      setText(label);
    }

    public CheckBox(String label, Direction dir) {
      this();
      setText(label, dir);
    }

    public CheckBox(String label, DirectionEstimator directionEstimator) {
      super(label, directionEstimator);
    }

    public CheckBox(String label, boolean asHTML) {
      super(label, asHTML);
    }

    protected CheckBox(Element elem) {
      super(elem);
    }

    public void setId(String id) {
        getElement().getElementsByTagName("input").getItem(0).setAttribute("id", id);
    }
    
    public void setDisabled(String s) {
        getElement().getElementsByTagName("input").getItem(0).setAttribute("disabled", s);
    }
}
