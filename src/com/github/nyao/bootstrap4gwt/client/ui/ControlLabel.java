package com.github.nyao.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.i18n.shared.DirectionEstimator;
import com.google.gwt.i18n.shared.HasDirectionEstimator;
import com.google.gwt.user.client.ui.DirectionalTextHelper;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class ControlLabel extends Widget implements HasText, HasDirectionEstimator {

    final DirectionalTextHelper directionalTextHelper;
    
    public ControlLabel() {
        super();
        setElement(Document.get().createLabelElement());
        setStyleName("control-label");
        directionalTextHelper = new DirectionalTextHelper(getElement(), true);
    }

    public ControlLabel(String text) {
        this();
        setText(text);
    }

    public void setFor(String id) {
        getElement().setAttribute("for", id);
    }

    @Override
    public DirectionEstimator getDirectionEstimator() {
        return directionalTextHelper.getDirectionEstimator();
    }

    @Override
    public void setDirectionEstimator(boolean enabled) {
        directionalTextHelper.setDirectionEstimator(enabled);
    }

    @Override
    public void setDirectionEstimator(DirectionEstimator directionEstimator) {
        directionalTextHelper.setDirectionEstimator(directionEstimator);
    }

    @Override
    public String getText() {
        return directionalTextHelper.getTextOrHtml(false);
    }

    @Override
    public void setText(String text) {
        directionalTextHelper.setTextOrHtml(text, false);
    }
}
