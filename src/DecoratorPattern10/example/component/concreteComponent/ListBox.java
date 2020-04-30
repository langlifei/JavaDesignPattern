package DecoratorPattern10.example.component.concreteComponent;

import DecoratorPattern10.example.component.Component;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 15:52
 * @Describe
 */

public class ListBox implements Component {
    @Override
    public void display() {
        System.out.println("显示列表框");
    }
}
