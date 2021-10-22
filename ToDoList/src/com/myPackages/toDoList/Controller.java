package com.myPackages.toDoList;

import com.myPackages.toDoList.dataModel.ToDoData;
import com.myPackages.toDoList.dataModel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<ToDoItem> toDoItems;

    @FXML
    private ListView<ToDoItem> toDoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadlineLabel;


    public void initialize() {
/*       ToDoItem item1 = new ToDoItem("Mail BirthDay Card", "Card for 30th birthday of John", LocalDate.of(2021, Month.OCTOBER, 17));
        ToDoItem item2 = new ToDoItem("Doctor's Appointment", "Jack doctor's appointment", LocalDate.of(2021, Month.APRIL, 8));
        ToDoItem item3 = new ToDoItem("Finish design proposal for client", "Task to finish in work by Jack", LocalDate.of(2021, Month.SEPTEMBER, 19));
        ToDoItem item4 = new ToDoItem("Mail BirthDay Card", "Card for 30th birthday of Dutch", LocalDate.of(2021, Month.NOVEMBER, 3));
        ToDoItem item5 = new ToDoItem("Mail BirthDay Card", "Card for 30th birthday of Uncle", LocalDate.of(2021, Month.DECEMBER, 21));
        toDoItems = new ArrayList<>();
        toDoItems.add(item1);
        toDoItems.add(item2);
        toDoItems.add(item3);
        toDoItems.add(item4);
        toDoItems.add(item5);

       ToDoData.getInstance().setToDoItems(toDoItems);*/

        toDoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observableValue, ToDoItem toDoItemOld, ToDoItem toDoItemNew) {
                if(toDoItemNew != null) {
                    ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });
        toDoListView.getItems().setAll(ToDoData.getInstance().getToDoItems());
        toDoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        toDoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleClickView() {
        ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());
    }
}
