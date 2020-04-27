package AbstractFactoryPattern03.example.product.concreteProduct.summer;

import AbstractFactoryPattern03.example.product.Button;

public class SummerButton extends Button {
    @Override
    public void display() {
        System.out.println("显示summer按钮");
    }
}
