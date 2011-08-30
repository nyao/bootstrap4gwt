package com.appspot.bootstrap4gwt.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Welcome implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel.get("Hello").add(new Hello());
		RootPanel.get("CellTable").add(new CellTableSample());
	}

}
