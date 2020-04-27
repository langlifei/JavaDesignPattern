package SimpleFactory01.exercise.factory;

import SimpleFactory01.exercise.product.Circle;
import SimpleFactory01.exercise.product.Square;
import SimpleFactory01.exercise.product.Triangle;
import SimpleFactory01.exercise.exception.UnSupportedShapeException;

public abstract class GeometricalShape {

    public abstract void draw();
    public abstract void erase();
    public static GeometricalShape factoryMethod(String name) throws UnSupportedShapeException {
        if(name.equals("circle"))
            return new Circle();
        else if(name.equals("square"))
            return new Square();
        else if(name.equals("triangle"))
            return new Triangle();
        else
            throw new UnSupportedShapeException("不支持这个图形");
    }

}
