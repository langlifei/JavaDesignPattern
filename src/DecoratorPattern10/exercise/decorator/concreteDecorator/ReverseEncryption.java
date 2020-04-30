package DecoratorPattern10.exercise.decorator.concreteDecorator;

import DecoratorPattern10.exercise.component.Component;
import DecoratorPattern10.exercise.decorator.Decorator;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 16:31
 * @Describe
 */

public class ReverseEncryption extends Decorator {
    public ReverseEncryption(Component component) {
        super(component);
    }

    @Override
    public String encryption(String password) {
        return reverseEncryption(super.encryption(password));
    }

    public String reverseEncryption(String password){
        System.out.println("使用逆转机密:" + password);
        return "(逆转加密:"+password+")";
    }
}
