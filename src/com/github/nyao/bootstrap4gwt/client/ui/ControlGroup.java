package com.github.nyao.bootstrap4gwt.client.ui;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ControlGroup extends HTMLPanel {

    public ControlGroup(SafeHtml safeHtml) {
        super(safeHtml);
        setStyleName("control-group");
    }

    public ControlGroup(String string) {
        super(string);
        setStyleName("control-group");
    }

    public ControlGroup(String tag, String html) {
        super(tag, html);
        setStyleName("control-group");
    }
    
    public void setState(ControlGroupState state) {
        setStyleName("control-group " + state.getValue());
    }

    public void setFor(String id) {
        getElement().setAttribute("for", id);
    }
}
