package FactoryMethodPattern02.example.product.concreteProduct;

import FactoryMethodPattern02.example.product.Logger;

public class FileLogger extends Logger {

    @Override
    public void writeLog() {
        System.out.println("编写文件日志相关信息");
    }
}
