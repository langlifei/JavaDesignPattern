package DecoratorPattern10.exercise.decorator;

import DecoratorPattern10.exercise.component.Component;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 16:29
 * @Describe
 */

public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public String encryption(String password) {
        return this.component.encryption(password);
    }
}
