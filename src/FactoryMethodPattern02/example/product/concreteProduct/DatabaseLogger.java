package FactoryMethodPattern02.example.product.concreteProduct;

import FactoryMethodPattern02.example.product.Logger;

public class DatabaseLogger extends Logger {
    @Override
    public void writeLog() {
        System.out.println("编写数据库日志");
    }
}
