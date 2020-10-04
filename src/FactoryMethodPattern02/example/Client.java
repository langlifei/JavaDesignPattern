package FactoryMethodPattern02.example;

import FactoryMethodPattern02.example.factory.LoggerFactory;
import FactoryMethodPattern02.example.product.Logger;


public class Client {
    /**
     * 工厂模式用于负责单个产品的创建
      * @param args
     */
    public static void main(String[] args) {
        //通过配置文件读取和java反射机制来实例化具体工厂对象，从而实现开闭原则.
        //生成一个具体产品类时,需要实现其具体的工厂类.
        LoggerFactory loggerFactory = (LoggerFactory) XMLUtil.getBean();
        Logger logger= loggerFactory.createLogger();
        logger.writeLog();
    }
}
