package AbstractFactoryPattern03.exercise.factory.concreteFactory;

import AbstractFactoryPattern03.exercise.factory.SystemFactory;
import AbstractFactoryPattern03.exercise.product.InterfaceController;
import AbstractFactoryPattern03.exercise.product.OperationController;
import AbstractFactoryPattern03.exercise.product.concreteProduct.android.AndroidInterfaceController;
import AbstractFactoryPattern03.exercise.product.concreteProduct.android.AndroidOperationController;

public class AndroidFactory extends SystemFactory {
    @Override
    public OperationController getOperationSystem() {
        return new AndroidOperationController();
    }

    @Override
    public InterfaceController getInterfaceController() {
        return new AndroidInterfaceController();
    }
}
