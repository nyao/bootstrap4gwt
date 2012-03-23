package com.github.nyao.bootstrap4gwt.client.ui;

import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.user.client.ui.HTMLPanel;

public class Controls extends HTMLPanel {

    public Controls(SafeHtml safeHtml) {
        super(safeHtml);
        setStyleName("controls");
    }

    public Controls(String string) {
        super(string);
        setStyleName("controls");
    }

    public Controls(String tag, String html) {
        super(tag, html);
        setStyleName("controls");
    }
}
