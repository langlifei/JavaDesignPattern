package SimpleFactory01.exercise.product;

import SimpleFactory01.exercise.factory.GeometricalShape;

public class Square extends GeometricalShape {
    @Override
    public void draw() {
        System.out.println("画出方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除方形");
    }
}
