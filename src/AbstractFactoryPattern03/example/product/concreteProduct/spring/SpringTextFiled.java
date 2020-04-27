package AbstractFactoryPattern03.example.product.concreteProduct.spring;

import AbstractFactoryPattern03.example.product.TextFiled;

public class SpringTextFiled extends TextFiled {
    @Override
    public void display() {
        System.out.println("显示Spring的文本输入框");
    }
}
