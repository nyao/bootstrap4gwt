package com.github.nyao.bootstrap4gwt.client.celltable;

import java.util.ArrayList;
import java.util.List;

import com.github.nyao.bootstrap4gwt.client.ui.Pagination;
import com.github.nyao.bootstrap4gwt.client.ui.PaginationNext;
import com.github.nyao.bootstrap4gwt.client.ui.PaginationPrev;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Anchor;

public class MyCellTable extends Composite {

    private static CellTableSampleUiBinder uiBinder = GWT.create(CellTableSampleUiBinder.class);

    interface CellTableSampleUiBinder extends UiBinder<Widget, MyCellTable> {
    }

    @UiField
    Button button;

    @UiField(provided = true)
    CellTable<Person> cellTable = new CellTable<Person>();

    SimplePager pager = new SimplePager();

    @UiField
    Pagination pagingPanel;

    List<Person> values = new ArrayList<Person>();

    @UiField
    FormPanel form;

    @UiField
    TextBox age;

    @UiField
    TextBox name;

    @UiField
    TextBox address;

    @UiField
    Button cancel;

    @UiField
    ListBox sex;

    public MyCellTable() {
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

        TextColumn<Person> sexClm = new TextColumn<Person>() {
            @Override
            public String getValue(Person object) {
                return object.getSex();
            }
        };
        cellTable.addColumn(sexClm, "Sex");

        for (int i = 0; i < 30; i ++) {
            Person p = new Person(10L + i, "Hoge" + i, "Foo" + i, "Bar" + i);
            values.add(p);
        }
        
        view();
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
        final Person person = new Person(
                Long.valueOf(age.getValue()), name.getValue(), address.getValue(), sex.getValue(sex.getSelectedIndex()));

        values.add(person);
        view();
        form.reset();
    }

    @UiHandler("cancel")
    void onCancelClick(ClickEvent event) {
        form.reset();
        age.setFocus(true);
    }

    private void view() {
        cellTable.setRowCount(values.size(), true);
        cellTable.setRowData(0, values);
        cellTable.redraw();

        pager.setDisplay(cellTable);
        pagingPanel.clear();
        final PaginationPrev prev = new PaginationPrev("prev");
        prev.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                setPageAndRedraw(pager.getPage() - 1);
            }
        });
        pagingPanel.add(prev);
        for (int i = 0; i < pager.getPageCount(); i++) {
            final int index = i;
            final Anchor pageAnchor = new Anchor(String.valueOf(index));
            pageAnchor.addClickHandler(new ClickHandler() {
                @Override
                public void onClick(ClickEvent event) {
                  pager.setPage(index);
                  cellTable.setRowCount(values.size(), true);
                  cellTable.setRowData(0, values);
                  cellTable.redraw();
                }
            });
            pagingPanel.add(pageAnchor);
        }
        final PaginationNext next = new PaginationNext("next");
        next.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                setPageAndRedraw(pager.getPage() + 1);
            }
        });
        pagingPanel.add(next);
    }

    void setPageAndRedraw(int page) {
        if (page < 0) {
            return;
        }
        pager.setPage(page);
        cellTable.setRowCount(values.size(), true);
        cellTable.setRowData(0, values);
        cellTable.redraw();
    }
}
