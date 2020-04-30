package DecoratorPattern10.example;

import DecoratorPattern10.example.component.Component;
import DecoratorPattern10.example.component.concreteComponent.ListBox;
import DecoratorPattern10.example.component.concreteComponent.TextBox;
import DecoratorPattern10.example.component.concreteComponent.Window;
import DecoratorPattern10.example.decorator.ComponentDecorator;
import DecoratorPattern10.example.decorator.concreteDecorator.BlackBorderDecorator;
import DecoratorPattern10.example.decorator.concreteDecorator.ScrollBarDecorator;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 15:58
 * @Describe
 */

public class Client {

    public static void main(String[] args) {
        Component component = new Window();
        Component component1 = new ScrollBarDecorator(component);
        Component component2 = new BlackBorderDecorator(component1);
        Component component3 = new ListBox();
        Component component4 = new ScrollBarDecorator(component3);
        component2.display();
        component4.display();
    }
}
