package AbstractFactoryPattern03.example.product.concreteProduct.summer;

import AbstractFactoryPattern03.example.product.TextFiled;

public class SummerTextFiled extends TextFiled {
    @Override
    public void display() {
        System.out.println("显示summer文本输入框");
    }
}
