package com.appspot.bootstrap4gwt.client.count;


import com.appspot.bootstrap4gwt.client.ui.ButtonPrimary;
import com.appspot.bootstrap4gwt.client.ui.UneditableInput;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class ClickCount extends Composite {
	
	private static HelloUiBinder uiBinder = GWT.create(HelloUiBinder.class);
	@UiField ButtonPrimary button;
	@UiField UneditableInput label;

	interface HelloUiBinder extends UiBinder<Widget, ClickCount> {
	}

	public ClickCount() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
        label.setText(String.valueOf(Integer.valueOf(label.getText()) + 1));
	}
}
