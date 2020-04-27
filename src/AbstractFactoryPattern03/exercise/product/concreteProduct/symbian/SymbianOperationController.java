package AbstractFactoryPattern03.exercise.product.concreteProduct.symbian;

import AbstractFactoryPattern03.exercise.product.OperationController;

public class SymbianOperationController extends OperationController {
    @Override
    public void display() {
        System.out.println("Symbian操作控制");
    }
}
