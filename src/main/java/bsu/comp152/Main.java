package bsu.comp152;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * A class for Project 4, COMP 152
 *
 * Starter code from Tony Gaddis, "Starting Out with Java"
 *
 * Modified by: Laura K. Gross, laura.gross@bridgew.edu, 3/2023
 *
 * Completed by: student name, student email, date of completion
 */
public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a Label component.
        Label messageLabel = new Label("Hello World");

        // Put the Label in a Scene.
        Scene scene = new Scene(messageLabel);
        // Or make the scene 500 pixels wide by 200 pixels high.
        // Scene scene = new Scene(messageLabel, 500, 200);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("My First Scene");

        // Show the window.
        primaryStage.show();
    }
}