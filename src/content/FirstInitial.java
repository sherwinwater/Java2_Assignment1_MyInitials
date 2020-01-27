package content;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstInitial extends Stage {

    // declare stage width and height
    private final double STAGE_WIDTH = 300;
    private final double STAGE_HEIGHT = 300;

    // declare arc parameters
    int arc1X = 110;
    int arc1Y = 80;
    int arc1RX = 50;
    int arc1RY = 50;
    int arc1Start = 90;
    int arc1Length = 180;

    // declare ellipse parameters
    int e1X = arc1X + arc1RX;
    int e1Y = (arc1Y - arc1RY) / 2 + 5;
    int e1RX = 50;
    int e1RY = 20;

    // declare rectangle parameters
    int rec1Width = 2 * e1RX;
    int rec1Height = 30;

    /**
     * create two ellipses with the same X-axis center, X-radius, and Y-radius and different Y-axis
     * center
     */
    Ellipse e1 = new Ellipse(e1X, e1Y + 10, e1RX, e1RY);
    Ellipse e2 = new Ellipse(e1X, e1Y + 10 + 4 * arc1RY - rec1Height,
            e1RX, e1RY);

    /**
     * create two arcs with the same X-radius, Y-radius, length and different X and Y-axis center,
     * the start position
     */
    Arc arc1 = new Arc(arc1X, arc1Y, arc1RX, arc1RY, arc1Start, arc1Length);
    Arc arc2 = new Arc(arc1X + rec1Width, arc1Y + 2 * arc1RY - rec1Height, arc1RX, arc1RY,
            arc1Start + 180, arc1Length);

    // rectangle's position is related to ellipse1 and arc1
    Rectangle rec1 = new Rectangle(e1X - e1RX, arc1Y + arc1RY - rec1Height, rec1Width, rec1Height);

    // create pane and vbox to add all elements
    Pane pane = new Pane();
    VBox root = new VBox();
    Text name = new Text("Shuwen Wang");

    /**
     * construct a public FirstInitial object which can be called from the Main.java
     */
    public FirstInitial() {

        // fill all elements with the same color Darkcyan
        arc1.setFill(Color.DARKCYAN);
        arc2.setFill(Color.DARKCYAN);
        e1.setFill(Color.DARKCYAN);
        e2.setFill(Color.DARKCYAN);
        rec1.setFill(Color.DARKCYAN);

        // fill the stroke of all elements with the same color Brown
        arc1.setStroke(Color.BROWN);
        arc2.setStroke(Color.BROWN);
        e1.setStroke(Color.BROWN);
        e2.setStroke(Color.BROWN);
        rec1.setStroke(Color.BROWN);

        // set the stroke width of all elements
        arc1.setStrokeWidth(5);
        arc2.setStrokeWidth(5);
        e1.setStrokeWidth(5);
        e2.setStrokeWidth(5);
        rec1.setStrokeWidth(5);

        // add all elements in the scene
        pane.getChildren().addAll(name, e1, arc1, rec1, arc2, e2);
        root.getChildren().addAll(name, pane);
        Scene scene = new Scene(root, STAGE_WIDTH, STAGE_HEIGHT);

        // set up the FirstInital stage
        this.setX(520);
        this.setY(200);
        this.setHeight(STAGE_HEIGHT);
        this.setWidth(STAGE_WIDTH);
        this.setTitle("First Initial-Shuwen Wang");
        this.setScene(scene);
        this.show();
    }

}
