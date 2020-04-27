package FactoryMethodPattern02.exercise.product.concreteFactory;

import FactoryMethodPattern02.exercise.product.Picture;

public class GIF extends Picture {
    @Override
    public void read() {
        System.out.println("读取GIF格式的图片");
    }
}
