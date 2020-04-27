package AbstractFactoryPattern03.exercise.factory.concreteFactory;

import AbstractFactoryPattern03.exercise.factory.SystemFactory;
import AbstractFactoryPattern03.exercise.product.InterfaceController;
import AbstractFactoryPattern03.exercise.product.OperationController;
import AbstractFactoryPattern03.exercise.product.concreteProduct.win.WinInterfaceController;
import AbstractFactoryPattern03.exercise.product.concreteProduct.win.WinOperationController;

public class WinFactory extends SystemFactory {
    @Override
    public OperationController getOperationSystem() {
        return new WinOperationController();
    }

    @Override
    public InterfaceController getInterfaceController() {
        return new WinInterfaceController();
    }
}
