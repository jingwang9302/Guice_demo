package drawingapp.service;

import com.google.inject.Inject;
import com.google.inject.Provides;
import drawingapp.annotations.ColorValue;
import drawingapp.annotations.EdgeValue;

public class DrawSquare implements DrawShape {
    private String color;
    private Integer edge;

    @Inject
    public DrawSquare(@ColorValue String color, @EdgeValue Integer edge) {

        this.color = color;
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square of " + color + ". Edge: "+ edge);
    }
}
