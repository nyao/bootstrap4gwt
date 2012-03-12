package com.appspot.bootstrap4gwt.client.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public class Pagination extends ComplexPanel {
    
    Element div = Document.get().createDivElement();
    Element ul = Document.get().createULElement();
    Li activeAnchor;
    Li prev;
    Li next;
    
    public Pagination() {
        div.appendChild(ul);
        setElement(div);
        setStyleName("pagination");
    }

    public void add(Anchor child) {
        final Li li = new Li();
        if (child.getStyleName().indexOf("active") > -1) {
            li.setStyleName("active");
        }
        
        child.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if (activeAnchor != null) activeAnchor.removeStyleName("active");
                li.addStyleName("active");
                activeAnchor = (Li) ((Anchor)event.getSource()).getParent();
            }
        });

        li.add(child);
        add(li, (com.google.gwt.user.client.Element) ul);
        
        if (activeAnchor != null) activeAnchor = li;
    }
    
    public void setPrev(Anchor anchor) {
        anchor.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final int index = getWidgetIndex(activeAnchor);
                int count = 1;
                if (prev != null) count --;
                if (index - 1 <= count) return;
                if (activeAnchor != null) activeAnchor.removeStyleName("active");
                activeAnchor = (Li) getWidget(index - 1);
                activeAnchor.addStyleName("active");
            }
        });
        
        final Li li = new Li();
        li.add(anchor);
        add(li, (com.google.gwt.user.client.Element) ul);
        this.prev = li;
    }

    public void setNext(Anchor anchor) {
        anchor.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                final int index = getWidgetIndex(activeAnchor);
                int count = getWidgetCount();
                if (prev != null) count --;
                if (next != null) count --;
                if (index >= count) return;
                if (activeAnchor != null) activeAnchor.removeStyleName("active");
                activeAnchor = (Li) getWidget(index + 1);
                activeAnchor.addStyleName("active");
            }
        });
        
        final Li li = new Li();
        li.add(anchor);
        add(li, (com.google.gwt.user.client.Element) ul);
        this.next = li;
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
