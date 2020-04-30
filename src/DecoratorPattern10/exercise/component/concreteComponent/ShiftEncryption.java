package DecoratorPattern10.exercise.component.concreteComponent;

import DecoratorPattern10.exercise.component.Component;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 16:26
 * @Describe
 */

public class ShiftEncryption implements Component {

    @Override
    public String encryption(String password) {
        System.out.println("使用移位加密:"+password);
        return "(移位加密:"+password+")";
    }
}
