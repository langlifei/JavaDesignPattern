package FactoryMethodPattern02.example.factory;

import FactoryMethodPattern02.example.product.Logger;

public abstract class LoggerFactory {

    public abstract Logger createLogger();
}
