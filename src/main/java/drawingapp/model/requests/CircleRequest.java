package drawingapp.model.requests;

import drawingapp.service.DrawShape;

public class CircleRequest {
    DrawShape circle;

    public CircleRequest(DrawShape circle) {
        this.circle = circle;
    }

    public void makeRequest(){
        circle.draw();
    }
}
