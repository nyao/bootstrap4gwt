package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.InlineHTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Breadcrumbs extends ComplexPanel {

    public Breadcrumbs() {
        setElement(Document.get().createULElement());
        setStyleName("breadcrumb");
    }
    
    public void add(Anchor child) {
        Li li = new Li();
        if (child.getStyleName().indexOf("active") > -1) {
            li.setStyleName("active");
        }
        if (getWidgetCount() > 0) {
            InlineHTML divider = new InlineHTML("/");
            divider.setStyleName("divider");
            li.add(divider);
        }
        li.add(child);
        add(li, getElement());
    }
    
    public void add(Li child) {
        Li li = new Li();
        li.setStyleName("active");
        if (getWidgetCount() > 0) {
            InlineHTML divider = new InlineHTML("/");
            divider.setStyleName("divider");
            li.add(divider);
        }
        li.add(child);
        add(li, getElement());
    }
    
    @Override
    @Deprecated
    public void add(IsWidget child) {
        super.add(child);
    }
    
    @Override
    @Deprecated
    public void add(Widget child) {
        super.add(child);
    }
    
    public Anchor getAnchor(int index) {
        return (Anchor) super.getWidget(index);
    }
    
    @Override
    @Deprecated
    public Widget getWidget(int index) {
        return super.getWidget(index);
    }
}
