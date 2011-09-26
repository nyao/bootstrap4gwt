package com.appspot.bootstrap4gwt.client;

import com.appspot.bootstrap4gwt.client.count.ClickCount;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Click implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel.get("Hello").add(new ClickCount());
	}

}
