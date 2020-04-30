package DecoratorPattern10.example.decorator.concreteDecorator;

import DecoratorPattern10.example.component.Component;
import DecoratorPattern10.example.decorator.ComponentDecorator;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 15:56
 * @Describe
 */

public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        setScrollBar();//父类无法调用子类方法,但子类可以重写父类方法,在重写的方法中调用自己的方法.
    }

    public void setScrollBar(){
        System.out.println("增加滚动条......");
    }
}
