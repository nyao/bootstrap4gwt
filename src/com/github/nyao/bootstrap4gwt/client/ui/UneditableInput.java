package com.github.nyao.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.Element;
import com.google.gwt.i18n.shared.DirectionEstimator;
import com.google.gwt.user.client.ui.InlineLabel;

public class UneditableInput extends InlineLabel {

    public UneditableInput() {
        super();
        setStyleName("input-xlarge uneditable-input");
    }

    public UneditableInput(String text) {
        this();
        setText(text);
    }

    public UneditableInput(String text, Direction dir) {
        this();
        setText(text, dir);
    }

    public UneditableInput(String text, DirectionEstimator directionEstimator) {
        this();
        setDirectionEstimator(directionEstimator);
        setText(text);
    }

    public UneditableInput(String text, boolean wordWrap) {
        this(text);
        setWordWrap(wordWrap);
    }

    protected UneditableInput(Element element) {
        super(element);
    }
}
