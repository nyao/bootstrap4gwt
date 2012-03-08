package com.appspot.bootstrap4gwt.client;

import com.appspot.bootstrap4gwt.client.forms.Forms;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class FormsSample implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get("Forms").add(new Forms());
    }

}
