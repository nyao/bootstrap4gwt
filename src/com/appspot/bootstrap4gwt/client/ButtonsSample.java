package com.appspot.bootstrap4gwt.client;

import com.appspot.bootstrap4gwt.client.buttons.Buttons;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class ButtonsSample implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get("Buttons").add(new Buttons());
    }

}
