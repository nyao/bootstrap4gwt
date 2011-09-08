package com.appspot.bootstrap4gwt.client.taskboard;

import java.util.ArrayList;
import java.util.List;

import com.allen_sauer.gwt.dnd.client.DragEndEvent;
import com.allen_sauer.gwt.dnd.client.DragHandler;
import com.allen_sauer.gwt.dnd.client.DragStartEvent;
import com.allen_sauer.gwt.dnd.client.PickupDragController;
import com.allen_sauer.gwt.dnd.client.VetoDragException;
import com.allen_sauer.gwt.dnd.client.drop.VerticalPanelDropController;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.AbsolutePanel;

public class TaskBoard extends Composite {

    private static TaskBoardUiBinder uiBinder = GWT
        .create(TaskBoardUiBinder.class);

    @UiField
    VerticalPanel todo;
    @UiField
    VerticalPanel doing;
    @UiField
    VerticalPanel reviewing;
    @UiField
    VerticalPanel done;
    @UiField
    AbsolutePanel boundaryPanel;

    interface TaskBoardUiBinder extends UiBinder<Widget, TaskBoard> {
    }

    public TaskBoard() {
        initWidget(uiBinder.createAndBindUi(this));
        List<VerticalPanel> columns = new ArrayList<VerticalPanel>();
        columns.add(todo);
        columns.add(doing);
        columns.add(reviewing);
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

        PickupDragController widgetDragController =
            new PickupDragController(this.boundaryPanel, false);
        widgetDragController.setBehaviorMultipleSelection(false);
        widgetDragController.addDragHandler(demoDragHandler);

        int count = 0;
        for (VerticalPanel columnPanel : columns) {
            VerticalPanelDropController widgetDropController = new VerticalPanelDropController(columnPanel);
            widgetDragController.registerDropController(widgetDropController);

            int random = Random.nextInt(4);
            for (int i = 0; i < random; i++) {
                HTML widget = new HTML("Draggable&nbsp;#" + ++count);
                columnPanel.add(widget);
                widgetDragController.makeDraggable(widget);
            }
        }
    }
}
