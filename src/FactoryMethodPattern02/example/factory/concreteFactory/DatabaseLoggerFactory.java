package FactoryMethodPattern02.example.factory.concreteFactory;

import FactoryMethodPattern02.example.factory.LoggerFactory;
import FactoryMethodPattern02.example.product.concreteProduct.DatabaseLogger;
import FactoryMethodPattern02.example.product.Logger;

public class DatabaseLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        //连接数据库.....
        //初始化.......
        //创建数据库日志的实例对象....
        return new DatabaseLogger();
    }
}
