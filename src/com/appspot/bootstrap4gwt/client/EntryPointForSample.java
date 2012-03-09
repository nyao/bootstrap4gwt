package com.appspot.bootstrap4gwt.client;

import com.appspot.bootstrap4gwt.client.sample.breadcrumbs.Breadcrumbs;
import com.appspot.bootstrap4gwt.client.sample.buttons.Buttons;
import com.appspot.bootstrap4gwt.client.sample.celltable.MyCellTable;
import com.appspot.bootstrap4gwt.client.sample.forms.Forms;
import com.appspot.bootstrap4gwt.client.sample.taskboard.TaskBoard;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class EntryPointForSample implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get("CellTable").add(new MyCellTable());
        RootPanel.get("Buttons").add(new Buttons());
        RootPanel.get("Forms").add(new Forms());
        RootPanel.get("Breadcrumbs").add(new Breadcrumbs());
        RootPanel.get("TaskBoard").add(new TaskBoard());
    }

}
