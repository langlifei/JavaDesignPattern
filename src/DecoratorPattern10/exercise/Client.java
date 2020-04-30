package DecoratorPattern10.exercise;

import DecoratorPattern10.exercise.component.Component;
import DecoratorPattern10.exercise.component.concreteComponent.ShiftEncryption;
import DecoratorPattern10.exercise.decorator.concreteDecorator.ModularEncryption;
import DecoratorPattern10.exercise.decorator.concreteDecorator.ReverseEncryption;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 16:37
 * @Describe
 */

public class Client {

    public static void main(String[] args) {
        Component component = new ShiftEncryption();
        Component component1 = new ReverseEncryption(component);
        Component component2 = new ModularEncryption(component1);
        System.out.println(component2.encryption("123456"));
    }
}
