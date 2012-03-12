package com.appspot.bootstrap4gwt.client.pagination;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Pagination extends Composite {

    private static BreadcrumbsUiBinder uiBinder = GWT.create(BreadcrumbsUiBinder.class);

    interface BreadcrumbsUiBinder extends UiBinder<Widget, Pagination> {
    }

    public Pagination() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
