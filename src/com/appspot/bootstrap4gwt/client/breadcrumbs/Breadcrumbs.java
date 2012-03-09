package com.appspot.bootstrap4gwt.client.breadcrumbs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Breadcrumbs extends Composite {

    private static BreadcrumbsUiBinder uiBinder = GWT.create(BreadcrumbsUiBinder.class);

    interface BreadcrumbsUiBinder extends UiBinder<Widget, Breadcrumbs> {
    }

    public Breadcrumbs() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
