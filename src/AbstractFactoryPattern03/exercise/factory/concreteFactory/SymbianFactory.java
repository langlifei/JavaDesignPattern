package AbstractFactoryPattern03.exercise.factory.concreteFactory;

import AbstractFactoryPattern03.exercise.factory.SystemFactory;
import AbstractFactoryPattern03.exercise.product.InterfaceController;
import AbstractFactoryPattern03.exercise.product.OperationController;
import AbstractFactoryPattern03.exercise.product.concreteProduct.symbian.SymbianInterfaceController;
import AbstractFactoryPattern03.exercise.product.concreteProduct.symbian.SymbianOperationController;

public class SymbianFactory extends SystemFactory {
    @Override
    public OperationController getOperationSystem() {
        return new SymbianOperationController();
    }

    @Override
    public InterfaceController getInterfaceController() {
        return new SymbianInterfaceController();
    }
}
