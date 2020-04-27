package AbstractFactoryPattern03.exercise.product.concreteProduct.ios;

import AbstractFactoryPattern03.exercise.product.InterfaceController;

public class IosInterfaceController extends InterfaceController {
    @Override
    public void display() {
        System.out.println("Ios界面控制");
    }
}
