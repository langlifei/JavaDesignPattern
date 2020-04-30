package DecoratorPattern10.example.decorator;

import DecoratorPattern10.example.component.Component;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 15:53
 * @Describe
 */

public class ComponentDecorator implements Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        this.component.display();
    }
}
