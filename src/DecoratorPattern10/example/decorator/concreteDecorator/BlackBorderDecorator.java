package DecoratorPattern10.example.decorator.concreteDecorator;

import DecoratorPattern10.example.component.Component;
import DecoratorPattern10.example.decorator.ComponentDecorator;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 16:04
 * @Describe
 */

public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        setBlackBorder();
    }

    public void setBlackBorder(){
        System.out.println("增加黑边框");
    }
}
