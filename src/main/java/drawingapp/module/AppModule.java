package drawingapp.module;

import com.google.inject.AbstractModule;
import drawingapp.annotations.ColorValue;
import drawingapp.annotations.EdgeValue;
import drawingapp.service.DrawShape;
import drawingapp.service.DrawSquare;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class);
        //bindings of constant values
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
    }
}
