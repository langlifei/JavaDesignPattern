package SimpleFactory01.exercise;

import SimpleFactory01.exercise.exception.UnSupportedShapeException;
import SimpleFactory01.exercise.factory.GeometricalShape;

public class Client {

    public static void main(String[] args) throws UnSupportedShapeException {
        String shapeName = XMLUtil.getShapeName();
        GeometricalShape shape = GeometricalShape.factoryMethod(shapeName);
        shape.draw();
        shape.erase();
    }
}
