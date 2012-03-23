package com.github.nyao.bootstrap4gwt.client.forms;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Forms extends Composite {

    private static FormsUiBinder uiBinder = GWT.create(FormsUiBinder.class);

    interface FormsUiBinder extends UiBinder<Widget, Forms> {
    }

    public Forms() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
