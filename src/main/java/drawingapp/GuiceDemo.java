package drawingapp;

import com.google.inject.Guice;
import com.google.inject.Injector;
import drawingapp.module.AppModule;
import drawingapp.model.requests.SquareRequest;
import drawingapp.service.DrawShape;

public class GuiceDemo {

    private static final String SQUARE_REQ = "SQUARE";
    private static void sendRequest(String square_req) {
        if(square_req.equals(SQUARE_REQ)){
//            DrawShape d = new DrawSquare();
//            replaced by following two lines
            Injector injector = Guice.createInjector(new AppModule()); // initialize --pending
            DrawShape d = injector.getInstance(DrawShape.class);

//            SquareRequest request = new SquareRequest(d);
            SquareRequest request = injector.getInstance(SquareRequest.class);
            SquareRequest request2 = injector.getInstance(SquareRequest.class);

            // singleton example:
            // request.makeRequest() == request2.makeRequest(), because DrawShape was defined as singleton,
            // but request != request2
            // in order to make request == request2, we need to add singleton scope to SquareRequest class in AppModule
            request.makeRequest();
            request2.makeRequest();
        }
    }
    public static void main(String[] args) {
        sendRequest(SQUARE_REQ);


    }
}
