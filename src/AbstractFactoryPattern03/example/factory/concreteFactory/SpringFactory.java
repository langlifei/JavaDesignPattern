package AbstractFactoryPattern03.example.factory.concreteFactory;

import AbstractFactoryPattern03.example.factory.SkinFactory;
import AbstractFactoryPattern03.example.product.Button;
import AbstractFactoryPattern03.example.product.ComboBox;
import AbstractFactoryPattern03.example.product.TextFiled;
import AbstractFactoryPattern03.example.product.concreteProduct.spring.SpringButton;
import AbstractFactoryPattern03.example.product.concreteProduct.spring.SpringComboBox;
import AbstractFactoryPattern03.example.product.concreteProduct.spring.SpringTextFiled;

public class SpringFactory extends SkinFactory {
    @Override
    public Button getButton() {
        return new SpringButton();
    }

    @Override
    public ComboBox getComboBox() {
        return new SpringComboBox();
    }

    @Override
    public TextFiled getTextFiled() {
        return new SpringTextFiled();
    }
}
