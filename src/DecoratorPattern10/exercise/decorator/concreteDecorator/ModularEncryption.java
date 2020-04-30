package DecoratorPattern10.exercise.decorator.concreteDecorator;

import DecoratorPattern10.exercise.component.Component;
import DecoratorPattern10.exercise.decorator.Decorator;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 16:35
 * @Describe
 */

public class ModularEncryption extends Decorator {
    public ModularEncryption(Component component) {
        super(component);
    }

    @Override
    public String encryption(String password) {
        return modularEncryption(super.encryption(password));
    }

    public String modularEncryption(String password){
        System.out.println("使用求模加密:"+password);
        return "(求模加密:"+password+")";
    }
}
