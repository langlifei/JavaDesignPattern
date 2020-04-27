package AbstractFactoryPattern03.exercise.factory.concreteFactory;

import AbstractFactoryPattern03.exercise.factory.SystemFactory;
import AbstractFactoryPattern03.exercise.product.InterfaceController;
import AbstractFactoryPattern03.exercise.product.OperationController;
import AbstractFactoryPattern03.exercise.product.concreteProduct.ios.IosInterfaceController;
import AbstractFactoryPattern03.exercise.product.concreteProduct.ios.IosOperationController;

public class IosFactory extends SystemFactory {
    @Override
    public OperationController getOperationSystem() {
        return new IosOperationController();
    }

    @Override
    public InterfaceController getInterfaceController() {
        return new IosInterfaceController();
    }
}
