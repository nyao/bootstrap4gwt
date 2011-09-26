package com.appspot.bootstrap4gwt.client;


import com.appspot.bootstrap4gwt.client.taskboard.TaskBoard;
import com.appspot.bootstrap4gwt.client.taskboard.StoryForm;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.RootPanel;

public class TaskBoardEntry implements EntryPoint {

	@Override
	public void onModuleLoad() {
        final TaskBoard tb = new TaskBoard();
        RootPanel.get("TaskBoard").add(tb);
        Button addStory = new Button("add Story", new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                DialogBox taskForm = new DialogBox();
                taskForm.setWidget(new StoryForm(taskForm, tb));
                taskForm.center();
            }
        });
        addStory.addStyleName("btn info");
        RootPanel.get("addStory").add(addStory);
	}

}
