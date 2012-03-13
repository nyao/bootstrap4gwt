package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.Element;

public class TextBox extends com.google.gwt.user.client.ui.TextBox {
    
    TextBoxState state;
    TextBoxInputSize inputSize;
    GridSize gridSize;
    TextBoxAlternateSize alternateSize;

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

    public void setState(TextBoxState state) {
        this.state = state;
        switch (state) {
            case Disabled:
                setEnabled(false);
                break;
        }
        setTextBoxStyle();
    }
    
    public void setInputSize(TextBoxInputSize size) {
        this.inputSize = size;
        setTextBoxStyle();
    }
    
    public void setGridSize(GridSize size) {
        this.gridSize = size;
        setTextBoxStyle();
    }
    
    public void setAlternateSize(TextBoxAlternateSize size) {
        this.alternateSize = size;
        setTextBoxStyle();
    }
    
    private void setTextBoxStyle() {
        setStyleName("");
        if (this.inputSize != null) addStyleName(this.inputSize.getValue());
        if (this.gridSize != null) addStyleName(this.gridSize.getValue());
        if (this.state != null) addStyleName(this.state.getValue());
        if (this.alternateSize != null) addStyleName(this.alternateSize.getValue());
    }
}
