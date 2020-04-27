package FactoryMethodPattern02.example;

import FactoryMethodPattern02.example.factory.LoggerFactory;
import FactoryMethodPattern02.example.product.Logger;

public class Client {

    public static void main(String[] args) {
        //通过配置文件读取和java反射机制来实例化具体工厂对象，从而实现开闭原则.
        LoggerFactory loggerFactory = (LoggerFactory) XMLUtil.getBean();
        Logger logger= loggerFactory.createLogger();
        logger.writeLog();
    }
}
