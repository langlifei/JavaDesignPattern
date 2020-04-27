package AbstractFactoryPattern03.exercise.product.concreteProduct.android;

import AbstractFactoryPattern03.exercise.product.InterfaceController;

public class AndroidInterfaceController extends InterfaceController {
    @Override
    public void display() {
        System.out.println("Android界面控制");
    }
}
