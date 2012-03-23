package com.github.nyao.bootstrap4gwt.client;

import com.github.nyao.bootstrap4gwt.client.breadcrumbs.Breadcrumbs;
import com.github.nyao.bootstrap4gwt.client.buttons.Buttons;
import com.github.nyao.bootstrap4gwt.client.celltable.MyCellTable;
import com.github.nyao.bootstrap4gwt.client.forms.Forms;
import com.github.nyao.bootstrap4gwt.client.pagination.Pagination;
import com.github.nyao.bootstrap4gwt.client.taskboard.TaskBoard;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class EntryPointForSample implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get("CellTable").add(new MyCellTable());
        RootPanel.get("Buttons").add(new Buttons());
        RootPanel.get("Forms").add(new Forms());
        RootPanel.get("Breadcrumbs").add(new Breadcrumbs());
        RootPanel.get("Pagination").add(new Pagination());
        RootPanel.get("TaskBoard").add(new TaskBoard());
    }

}
