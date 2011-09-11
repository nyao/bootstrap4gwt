package com.appspot.bootstrap4gwt.client.taskboard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class TaskForm extends Composite {

    private static TaskFormUiBinder uiBinder = GWT
        .create(TaskFormUiBinder.class);

    @UiField
    TextArea subject;

    @UiField
    Button button;

    DialogBox form;

    TaskBoard caller;
    
    Story callerByStory;

    interface TaskFormUiBinder extends UiBinder<Widget, TaskForm> {
    }

    public TaskForm(DialogBox form, TaskBoard tb) {
        this.form = form;
        this.caller = tb;
        initWidget(uiBinder.createAndBindUi(this));
    }

    public TaskForm(DialogBox taskForm, Story story) {
        this.form = taskForm;
        this.callerByStory = story;
        initWidget(uiBinder.createAndBindUi(this));
    }

    @UiHandler("button")
    void onButtonClick(ClickEvent event) {
        if (subject.getText().isEmpty()) {
            event.preventDefault();
            return;
        }
        
        if (caller != null) {
            caller.addStory(subject.getText());
        } else {
            callerByStory.addTask(subject.getText());
        }
        form.hide();
    }
}
