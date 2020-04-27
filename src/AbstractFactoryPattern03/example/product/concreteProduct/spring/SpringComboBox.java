package AbstractFactoryPattern03.example.product.concreteProduct.spring;

import AbstractFactoryPattern03.example.product.ComboBox;

public class SpringComboBox extends ComboBox {
    @Override
    public void display() {
        System.out.println("显示Spring的复选框");
    }
}
