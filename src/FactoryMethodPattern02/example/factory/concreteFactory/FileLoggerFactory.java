package FactoryMethodPattern02.example.factory.concreteFactory;

import FactoryMethodPattern02.example.factory.LoggerFactory;
import FactoryMethodPattern02.example.product.concreteProduct.FileLogger;
import FactoryMethodPattern02.example.product.Logger;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        //创建文件相关的信息....
        //对文件进行一些预处理方面的工作....
        //创建文件日志的实例对象....
        return new FileLogger();
    }
}
