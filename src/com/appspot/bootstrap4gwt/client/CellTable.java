package com.appspot.bootstrap4gwt.client;

import com.appspot.bootstrap4gwt.client.celltable.CellTableSample;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class CellTable implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel.get("CellTable").add(new CellTableSample());
	}

}
