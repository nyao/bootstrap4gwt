package com.appspot.bootstrap4gwt.client.taskboard;

import java.util.ArrayList;
import java.util.List;

import com.appspot.bootstrap4gwt.client.ui.Button;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;

public class TaskBoard extends Composite {

    private static TaskBoardUiBinder uiBinder = GWT
        .create(TaskBoardUiBinder.class);

    @UiField
    FlowPanel boundaryPanel;
    
    @UiField
    Button addStory;

    interface TaskBoardUiBinder extends UiBinder<Widget, TaskBoard> {
    }

    public TaskBoard() {
        initWidget(uiBinder.createAndBindUi(this));

        List<String> stories = new ArrayList<String>();
        stories.add("ABC is nice");
        stories.add("want DEF");
        stories.add("should be XYZ");

        for (String story : stories) {
            addStory(story);
        }
    }

    public void addStory(String text) {
        Story s = new Story(text);
        this.boundaryPanel.add(s);
    }
    
    @UiHandler("addStory")
    void onButtonClick(ClickEvent event) {
        DialogBox taskForm = new DialogBox();
        taskForm.setWidget(new StoryForm(taskForm, this));
        taskForm.center();
    }
}
