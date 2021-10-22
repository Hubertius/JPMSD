package com.myPackages.toDoList;

import com.myPackages.toDoList.dataModel.ToDoData;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
        primaryStage.setTitle("Todo List");
        primaryStage.setScene(new Scene(root, 900, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        try {
            ToDoData.getInstance().loadToDoItems();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void stop() throws Exception {
        try {
            ToDoData.getInstance().storeToDoItems();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
