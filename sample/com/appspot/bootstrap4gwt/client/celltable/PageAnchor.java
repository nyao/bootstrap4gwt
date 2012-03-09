package com.appspot.bootstrap4gwt.client.celltable;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public abstract class PageAnchor extends Composite {

	private static PageAnchorUiBinder uiBinder = GWT
			.create(PageAnchorUiBinder.class);

	interface PageAnchorUiBinder extends UiBinder<Widget, PageAnchor> {
	}
	
	@UiField
	Anchor anchor;

	public PageAnchor(String text) {
		initWidget(uiBinder.createAndBindUi(this));
		anchor.setText(text);
	}

	@UiHandler("anchor")
	abstract void onAnchorClick(ClickEvent event);

	public void activation() {
		anchor.getParent().addStyleName("active");
	}

	public void deactivation() {
		anchor.getParent().removeStyleName("active");
	}
}
