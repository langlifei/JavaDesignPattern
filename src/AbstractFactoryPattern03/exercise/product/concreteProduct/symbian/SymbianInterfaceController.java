package AbstractFactoryPattern03.exercise.product.concreteProduct.symbian;

import AbstractFactoryPattern03.exercise.product.InterfaceController;

public class SymbianInterfaceController extends InterfaceController {
    @Override
    public void display() {
        System.out.println("Symbian界面控制");
    }
}
