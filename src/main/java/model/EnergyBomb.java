package model;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class EnergyBomb extends Rectangle {

    public EnergyBomb(int width , int height) {
        super(width , height);
        super.setFill(new ImagePattern(new Image(getClass().getResource("/images/Bomb.png").toExternalForm())));
    }
}
