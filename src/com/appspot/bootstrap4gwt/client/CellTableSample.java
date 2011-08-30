package com.appspot.bootstrap4gwt.client;

import java.util.ArrayList;
import java.util.List;


import com.appspot.bootstrap4gwt.client.service.HelloWorldService;
import com.appspot.bootstrap4gwt.client.service.HelloWorldServiceAsync;
import com.appspot.bootstrap4gwt.shared.model.Person;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;

public class CellTableSample extends Composite {
    
    HelloWorldServiceAsync service = GWT.create(HelloWorldService.class);

	private static CellTableSampleUiBinder uiBinder = GWT.create(CellTableSampleUiBinder.class);

	interface CellTableSampleUiBinder extends UiBinder<Widget, CellTableSample> {
	}

	@UiField
	Button button;
	
	@UiField(provided=true) CellTable<Person> cellTable = new CellTable<Person>();
	List<Person> values = new ArrayList<Person>();
	
	@UiField
	FormPanel form;
	
	@UiField
	TextBox age;

	@UiField
	TextBox name;

	@UiField
	TextBox address;

	public CellTableSample() {
		initWidget(uiBinder.createAndBindUi(this));
		
		TextColumn<Person> ageClm = new TextColumn<Person>() {
			@Override
			public String getValue(Person object) {
				return object.getAge().toString();
			}
		};
		cellTable.addColumn(ageClm, "Age");

		TextColumn<Person> nameClm = new TextColumn<Person>() {
			@Override
			public String getValue(Person object) {
				return object.getName();
			}
		};
		cellTable.addColumn(nameClm, "Name");

		TextColumn<Person> addressClm = new TextColumn<Person>() {
			@Override
			public String getValue(Person object) {
				return object.getAddress();
			}
		};
		cellTable.addColumn(addressClm, "Address");
		
		reloadPersons();
	}
	
	private void reloadPersons() {
        service.getPersons(new AsyncCallback<List<Person>>() {
            @Override
            public void onSuccess(List<Person> result) {
                System.out.println(result.size());
                values.clear();
                values.addAll(result);
                cellTable.setRowCount(values.size(), true);
                cellTable.setRowData(0, values);
                cellTable.redraw();
            }
            
            @Override
            public void onFailure(Throwable caught) {
                Window.alert(caught.getMessage());
            }
        });
	}
	
	@UiHandler("age")
	void onKeyPress(KeyPressEvent event) {
		if (event.getCharCode() < '0' || event.getCharCode() > '9') {
			Element elm = age.getElement().getParentElement().getParentElement();
			elm.addClassName("error");
			event.preventDefault();
		}
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		final Person person = new Person(Long.valueOf(age.getValue()), name.getValue(), address.getValue());
		
		service.addPerson(person, new AsyncCallback<Person>() {
            @Override
            public void onSuccess(Person result) {
                values.add(person);
                cellTable.setRowCount(values.size(), true);
                cellTable.setRowData(0, values);
                cellTable.redraw();
                form.reset();
            }
            
            @Override
            public void onFailure(Throwable caught) {
                Window.alert(caught.getMessage());
            }
        });
	}

}
