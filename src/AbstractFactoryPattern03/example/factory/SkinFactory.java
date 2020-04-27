package AbstractFactoryPattern03.example.factory;

import AbstractFactoryPattern03.example.product.Button;
import AbstractFactoryPattern03.example.product.ComboBox;
import AbstractFactoryPattern03.example.product.TextFiled;

public abstract class SkinFactory {

    public abstract Button getButton();

    public abstract ComboBox getComboBox();

    public abstract TextFiled getTextFiled();
}
