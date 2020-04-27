package SimpleFactory01.exercise.product;

import SimpleFactory01.exercise.factory.GeometricalShape;

public class Triangle extends GeometricalShape {
    @Override
    public void draw() {
        System.out.println("画出三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}
