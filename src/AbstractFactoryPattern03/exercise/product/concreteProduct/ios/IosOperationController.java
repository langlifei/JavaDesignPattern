package AbstractFactoryPattern03.exercise.product.concreteProduct.ios;

import AbstractFactoryPattern03.exercise.product.OperationController;

public class IosOperationController extends OperationController {

    @Override
    public void display() {
        System.out.println("Ios操作控制");
    }
}
