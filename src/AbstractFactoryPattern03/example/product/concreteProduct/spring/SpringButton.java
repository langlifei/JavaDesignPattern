package AbstractFactoryPattern03.example.product.concreteProduct.spring;

import AbstractFactoryPattern03.example.product.Button;

public class SpringButton extends Button {
    @Override
    public void display() {
        System.out.println("显示Spring的按钮");
    }
}
