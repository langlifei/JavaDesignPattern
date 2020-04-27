package SimpleFactory01.exercise.product;

import SimpleFactory01.exercise.factory.GeometricalShape;

public class Circle extends GeometricalShape {
    @Override
    public void draw() {
        System.out.println("画出圆形图案");
    }



    @Override
    public void erase() {
        System.out.println("擦除圆形图案");
    }
}
