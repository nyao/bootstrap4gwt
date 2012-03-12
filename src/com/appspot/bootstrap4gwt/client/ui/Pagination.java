package com.appspot.bootstrap4gwt.client.ui;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Pagination extends ComplexPanel {

    public Pagination() {
        Element div = Document.get().createDivElement();
        div.appendChild(Document.get().createULElement());
        setElement(div);
        setStyleName("pagination");
    }

    public void add(Anchor child) {
        Li li = new Li();
        if (child.getStyleName().indexOf("active") > -1) {
            li.setStyleName("active");
        }
        
        addLi(li, child);
    }

    public void add(Li child) {
        Li li = new Li();
        li.setStyleName("active");
        
        addLi(li, child);
    }
    
    private void addLi(Li li, Widget w) {
        li.add(w);
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
        if (child instanceof FlowPanel == false) super.add(child);

        FlowPanel panel = (FlowPanel) child;
        System.out.println();
        for (int i = 0; i < panel.getWidgetCount(); i ++) {
            Anchor pa = (Anchor) panel.getWidget(i);
            add(pa);
        }
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
