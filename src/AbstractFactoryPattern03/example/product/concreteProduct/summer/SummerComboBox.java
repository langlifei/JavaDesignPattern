package AbstractFactoryPattern03.example.product.concreteProduct.summer;

import AbstractFactoryPattern03.example.product.ComboBox;

public class SummerComboBox extends ComboBox {
    @Override
    public void display() {
        System.out.println("显示summer复选框");
    }
}
