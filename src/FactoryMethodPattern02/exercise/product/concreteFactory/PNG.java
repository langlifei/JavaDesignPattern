package FactoryMethodPattern02.exercise.product.concreteFactory;

import FactoryMethodPattern02.exercise.product.Picture;

public class PNG extends Picture {
    @Override
    public void read() {
        System.out.println("读取PNG图片");
    }
}
