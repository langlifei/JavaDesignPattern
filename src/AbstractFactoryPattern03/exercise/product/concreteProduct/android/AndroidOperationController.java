package AbstractFactoryPattern03.exercise.product.concreteProduct.android;

import AbstractFactoryPattern03.exercise.product.OperationController;

public class AndroidOperationController extends OperationController {
    @Override
    public void display() {
        System.out.println("Android操作控制");
    }
}
