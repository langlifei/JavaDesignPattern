package FactoryMethodPattern02.exercise.product.concreteFactory;

import FactoryMethodPattern02.exercise.product.Picture;

public class JPG extends Picture {
    @Override
    public void read() {
        System.out.println("读取JPG的图片");
    }
}
