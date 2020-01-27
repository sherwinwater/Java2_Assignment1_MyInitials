/**
 * Shuwen Wang
 * 991583096
 * Assignment 1
 * 01-20-2020
 */
package myinitials;

import content.FirstInitial;
import content.SecondInitial;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    // declare the stage width and height
    private final double STAGE_WIDTH = 300;
    private final double STAGE_HEIGHT = 300;

    @Override
    public void start(Stage primaryStage) {
        /**
         * resize image to 300x250 and keep the ratio with high quality filtering method
         */
        Image myPhoto = new Image("images/shuwen.jpg", 300, 250, true, true);
        ImageView myPhotoView = new ImageView(myPhoto);

        // use VBox to add name and image to the scene
        Text name = new Text("Shuwen Wang");
        VBox root = new VBox();
        root.getChildren().addAll(name, myPhotoView);
        Scene scene = new Scene(root, STAGE_WIDTH, STAGE_HEIGHT);

        // set up the stage
        primaryStage.setX(200);
        primaryStage.setY(200);
        primaryStage.setHeight(STAGE_HEIGHT);
        primaryStage.setWidth(STAGE_WIDTH);
        primaryStage.setTitle("Primary Stage-Shuwen Wang");
        primaryStage.setScene(scene);
        primaryStage.show();

        // call the other two stages
        new FirstInitial();
        new SecondInitial();
        
//                new FirstInitial().show;
//        new SecondInitial().show;
        
    }

    /*A main method to launch the program
     */
    public static void main(String[] args) {
        launch(args);
    }
}
