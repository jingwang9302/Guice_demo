package drawingapp.model.requests;

import com.google.inject.Inject;
import drawingapp.service.DrawShape;



public class SquareRequest {
    DrawShape drawShape;

    @Inject
    public SquareRequest(DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    public void makeRequest(){
        drawShape.draw();
    }


//    Method injection
//    @Inject
//    public void setDrawShape(DrawShape drawShape) {
//        this.drawShape = drawShape;
//    }



}
