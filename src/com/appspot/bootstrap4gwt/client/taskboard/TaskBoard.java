package com.appspot.bootstrap4gwt.client.taskboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TaskBoard extends Composite {

    private static TaskBoardUiBinder uiBinder = GWT
        .create(TaskBoardUiBinder.class);
    
    @UiField VerticalPanel todo;
    @UiField VerticalPanel doing;
    @UiField VerticalPanel reviewing;
    @UiField VerticalPanel done;

    interface TaskBoardUiBinder extends UiBinder<Widget, TaskBoard> {
    }

    public TaskBoard() {
        initWidget(uiBinder.createAndBindUi(this));
    }

}
