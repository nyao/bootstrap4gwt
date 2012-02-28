package com.appspot.bootstrap4gwt.client.taskboard;

import java.util.ArrayList;
import java.util.List;

import com.allen_sauer.gwt.dnd.client.DragEndEvent;
import com.allen_sauer.gwt.dnd.client.DragHandler;
import com.allen_sauer.gwt.dnd.client.DragStartEvent;
import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.allen_sauer.gwt.dnd.client.VetoDragException;
import com.allen_sauer.gwt.dnd.client.drop.FlowPanelDropController;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class Story extends Composite {

    private static StoryUiBinder uiBinder = GWT.create(StoryUiBinder.class);

    @UiField
    FlowPanelWithSpacer todo;

    @UiField
    FlowPanelWithSpacer doing;

    @UiField
    FlowPanelWithSpacer done;

    @UiField
    AbsolutePanel boundaryPanel;
    
    @UiField
    Label storyName;
    
    @UiField
    Button addTask;

    PickupDragController widgetDragController;

    interface StoryUiBinder extends UiBinder<Widget, Story> {
    }

    public Story(String story) {
        initWidget(uiBinder.createAndBindUi(this));
        this.storyName.setText(story);

        List<FlowPanelWithSpacer> columns =
            new ArrayList<FlowPanelWithSpacer>();
        columns.add(todo);
        columns.add(doing);
        columns.add(done);

        DragHandler demoDragHandler = new DragHandler() {
            @Override
            public void onPreviewDragStart(DragStartEvent event)
                    throws VetoDragException {
            }

            @Override
            public void onPreviewDragEnd(DragEndEvent event)
                    throws VetoDragException {
            }

            @Override
            public void onDragStart(DragStartEvent event) {
            }

            @Override
            public void onDragEnd(DragEndEvent event) {
            }
        };

        widgetDragController = new PickupDragController(this.boundaryPanel, false);
        widgetDragController.setBehaviorMultipleSelection(false);
        widgetDragController.addDragHandler(demoDragHandler);
        int count = 0;
        for (FlowPanelWithSpacer columnPanel : columns) {
            FlowPanelDropController widgetDropController = new FlowPanelDropController(columnPanel);
            widgetDragController.registerDropController(widgetDropController);

            int random = Random.nextInt(2);
            for (int i = 0; i <= random; i++) {
                addTask("Task&nbsp;#" + ++count, columnPanel);
            }
        }
    }

    public void addTask(String name, FlowPanel columnPanel) {
        HTML widget = new HTML(name);
        widget.addStyleName("alert alert-info");
        columnPanel.add(widget);
        widgetDragController.makeDraggable(widget);
    }
    
    @UiHandler("addTask")
    void onAddTaskClick(ClickEvent event) {
        DialogBox form = new DialogBox();
        form.setWidget(new TaskForm(form, this));
        form.center();
    }

    public void addTask(String text) {
        this.addTask(text, todo);
    }
}
