package content;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SecondInitial extends Stage {

    // declare stage width and height
    private final double STAGE_WIDTH = 300;
    private final double STAGE_HEIGHT = 300;

    // declare arc parameters
    int arc1X = 50;
    int arc1Y = 120;
    int arc1RX = 30;
    int arc1RY = 90;
    int arc1Start = 90;
    int arc1Length = 180;
    int rotateAngle = 20;

    // declare ellipse parameters
    int e1X = arc1X + 60;
    int e1Y = arc1Y;
    int e1RX = arc1RX / 2;
    int e1RY = arc1RY;

    // declare rectangle parameters
    int rec1Width = 2 * e1RX;
    int rec1Height = 30;
    int space = 120;

    // declare circle parameters
    int circleX = e1X + space + e1RX - 3;
    int circleY = e1Y - e1RY + 16;
    int circleR = 25;

    /**
     * create two ellipses with the same Y-axis center, X-radius, and Y-radius
     * and different X-axis center
     */
    Ellipse e1 = new Ellipse(e1X, e1Y, e1RX, e1RY);
    Ellipse e2 = new Ellipse(e1X + space, e1Y, e1RX, e1RY);

    // create three arcs 
    Arc arc1 = new Arc(arc1X, arc1Y, arc1RX, arc1RY, arc1Start, arc1Length);
    Arc arc2 = new Arc(arc1X + space, arc1Y, arc1RX, arc1RY, arc1Start, arc1Length);
    Arc arc3 = new Arc(circleX, circleY - 26, circleR * 2, circleR * 2, 275, 45);

    // create one circle
    Circle c1 = new Circle(circleX, circleY, circleR);

    // create pane and vbox to add all elements
    Pane pane = new Pane();
    VBox root = new VBox();
    Text name = new Text("Shuwen Wang");

    /**
     * construct a public SecondInitial object which can be called from the
     * Main.java
     */
    public SecondInitial() {

        // rotate arc and ellipse
        arc1.setRotate(-1 * rotateAngle);
        arc2.setRotate(-1 * rotateAngle);
        e1.setRotate(rotateAngle);
        e2.setRotate(rotateAngle);

        // fill all elements with the same color
        arc1.setFill(Color.BLUEVIOLET);
        arc2.setFill(Color.BLUEVIOLET);
        e1.setFill(Color.BLUEVIOLET);
        e2.setFill(Color.BLUEVIOLET);
        c1.setFill(Color.WHITE);
        arc3.setFill(Color.BLUEVIOLET);

        // fill the stroke of all elements with the same color Brown
        arc1.setStroke(Color.BLUE);
        arc2.setStroke(Color.BLUE);
        e1.setStroke(Color.BLUE);
        e2.setStroke(Color.BLUE);
        c1.setStroke(Color.BLUE);
        arc3.setStroke(Color.BLUE);

        // set the stroke width of all elements
        arc1.setStrokeWidth(5);
        arc2.setStrokeWidth(5);
        e1.setStrokeWidth(5);
        e2.setStrokeWidth(5);
        c1.setStrokeWidth(7);
        arc3.setStrokeWidth(7);

        // set arc3 to be Chord type
        arc3.setType(ArcType.CHORD);

        // add all elements in the scene
        pane.getChildren().addAll(arc1, e1, arc2, c1, e2, arc3);
        root.getChildren().addAll(name, pane);
        Scene scene = new Scene(root, STAGE_WIDTH, STAGE_HEIGHT);

        // set up the SecondInital stage
        this.setX(840);
        this.setY(200);
        this.setHeight(STAGE_HEIGHT);
        this.setWidth(STAGE_WIDTH);
        this.setTitle("Second Initial-Shuwen Wang");
        this.setScene(scene);
        this.show();
    }

}
