package AbstractFactoryPattern03.example;

import AbstractFactoryPattern03.example.factory.SkinFactory;
import AbstractFactoryPattern03.example.product.Button;
import AbstractFactoryPattern03.example.product.ComboBox;
import AbstractFactoryPattern03.example.product.TextFiled;

public class Client {
    public static void main(String[] args) {
        SkinFactory skinFactory = (SkinFactory) XMLUtil.getBean();
        Button button = skinFactory.getButton();
        ComboBox comboBox = skinFactory.getComboBox();
        TextFiled textFiled = skinFactory.getTextFiled();
        button.display();
        comboBox.display();
        textFiled.display();
    }
}
