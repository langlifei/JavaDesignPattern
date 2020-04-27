package AbstractFactoryPattern03.exercise.factory;

import AbstractFactoryPattern03.exercise.product.InterfaceController;
import AbstractFactoryPattern03.exercise.product.OperationController;

public abstract class SystemFactory {
    public abstract OperationController getOperationSystem();
    public abstract InterfaceController getInterfaceController();
}
