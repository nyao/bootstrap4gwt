package com.appspot.bootstrap4gwt.client;


import com.appspot.bootstrap4gwt.client.taskboard.TaskBoard;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Welcome implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel.get("Hello").add(new Hello());
		RootPanel.get("CellTable").add(new CellTableSample());
        RootPanel.get("TaskBoard").add(new TaskBoard());
	}

}
