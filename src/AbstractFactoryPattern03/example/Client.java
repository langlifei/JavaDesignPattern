package AbstractFactoryPattern03.example;

import AbstractFactoryPattern03.example.factory.SkinFactory;
import AbstractFactoryPattern03.example.product.Button;
import AbstractFactoryPattern03.example.product.ComboBox;
import AbstractFactoryPattern03.example.product.TextFiled;

public class Client {

    /**
     * 负责创建整个产品族,即创建一个不用分割的整体系列,缺点不能增加新的产品等级结构
     * @param args
     */
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
