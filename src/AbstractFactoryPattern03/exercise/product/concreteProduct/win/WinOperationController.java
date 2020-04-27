package AbstractFactoryPattern03.exercise.product.concreteProduct.win;

import AbstractFactoryPattern03.exercise.product.OperationController;

public class WinOperationController extends OperationController {
    @Override
    public void display() {
        System.out.println("Win操作控制");
    }
}
