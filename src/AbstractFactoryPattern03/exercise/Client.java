package AbstractFactoryPattern03.exercise;

import AbstractFactoryPattern03.exercise.factory.SystemFactory;
import AbstractFactoryPattern03.exercise.product.InterfaceController;
import AbstractFactoryPattern03.exercise.product.OperationController;

public class Client {

    public static void main(String[] args) {
        SystemFactory systemFactory = (SystemFactory) XMLUtil.getBean();
        OperationController operationController = systemFactory.getOperationSystem();
        InterfaceController interfaceController = systemFactory.getInterfaceController();
        operationController.display();
        interfaceController.display();
    }
}
