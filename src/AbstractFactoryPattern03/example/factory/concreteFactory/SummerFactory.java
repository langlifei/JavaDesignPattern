package AbstractFactoryPattern03.example.factory.concreteFactory;

import AbstractFactoryPattern03.example.factory.SkinFactory;
import AbstractFactoryPattern03.example.product.Button;
import AbstractFactoryPattern03.example.product.ComboBox;
import AbstractFactoryPattern03.example.product.TextFiled;
import AbstractFactoryPattern03.example.product.concreteProduct.summer.SummerButton;
import AbstractFactoryPattern03.example.product.concreteProduct.summer.SummerComboBox;
import AbstractFactoryPattern03.example.product.concreteProduct.summer.SummerTextFiled;

public class SummerFactory extends SkinFactory {
    @Override
    public Button getButton() {
        return new SummerButton();
    }

    @Override
    public ComboBox getComboBox() {
        return new SummerComboBox();
    }

    @Override
    public TextFiled getTextFiled() {
        return new SummerTextFiled();
    }
}
