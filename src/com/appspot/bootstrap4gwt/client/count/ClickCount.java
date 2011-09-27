package com.appspot.bootstrap4gwt.client.count;


import com.appspot.bootstrap4gwt.client.service.HelloWorldService;
import com.appspot.bootstrap4gwt.client.service.HelloWorldServiceAsync;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Label;

public class ClickCount extends Composite {
	
	HelloWorldServiceAsync service = GWT.create(HelloWorldService.class);

	private static HelloUiBinder uiBinder = GWT.create(HelloUiBinder.class);
	@UiField Button button;
	@UiField Label label;

	interface HelloUiBinder extends UiBinder<Widget, ClickCount> {
	}

	public ClickCount() {
		initWidget(uiBinder.createAndBindUi(this));
		service.getCount(new Counter());
	}

	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
		service.count(new Counter());
	}

	private final class Counter implements AsyncCallback<Long> {
		@Override
		public void onSuccess(Long result) {
			label.setText(result.toString());
		}

		@Override
		public void onFailure(Throwable caught) {
			Window.alert(caught.getMessage());
		}
	}
}
