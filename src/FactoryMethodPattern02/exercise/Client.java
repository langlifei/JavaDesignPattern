package FactoryMethodPattern02.exercise;

import FactoryMethodPattern02.exercise.factory.PictureFactory;

public class Client {

    public static void main(String[] args) {
        PictureFactory pictureFactory = (PictureFactory) XMLUtil.getBean();
        //直接使用工厂对象来调用产品对象的业务方法
        pictureFactory.read();
    }
}
