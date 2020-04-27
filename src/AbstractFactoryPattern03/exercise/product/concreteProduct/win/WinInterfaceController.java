package AbstractFactoryPattern03.exercise.product.concreteProduct.win;

import AbstractFactoryPattern03.exercise.product.InterfaceController;

public class WinInterfaceController extends InterfaceController {
    @Override
    public void display() {
        System.out.println("Win界面控制");
    }
}
