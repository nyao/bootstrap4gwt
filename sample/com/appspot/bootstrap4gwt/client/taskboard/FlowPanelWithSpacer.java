package com.appspot.bootstrap4gwt.client.taskboard;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class FlowPanelWithSpacer extends FlowPanel {

    public FlowPanelWithSpacer() {
        HTML spacerLabel = new HTML("<hr />");
        spacerLabel.setHeight("50px");
        super.add(spacerLabel);
    }

    @Override
    public void add(Widget w) {
        super.insert(w, getWidgetCount() - 1);
    }

    @Override
    public void insert(Widget w, int beforeIndex) {
        if (beforeIndex == getWidgetCount()) {
            beforeIndex--;
        }
        super.insert(w, beforeIndex);
    }

}
