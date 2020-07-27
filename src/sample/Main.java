package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;


import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        primaryStage.setTitle("War World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


//
//        VBox vBox = new VBox(root);
//
//        // Create a ScrollPane
//        ScrollPane scrollPane = new ScrollPane();
//
//        // Set content for ScrollPane
//        scrollPane.setContent(vBox);
//
//        // Always show vertical scroll bar
//        scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
//
//        // Horizontal scroll bar is only displayed when needed
//        scrollPane.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);

    }




    public static void main(String[] args) {
        launch(args);
    }
}
