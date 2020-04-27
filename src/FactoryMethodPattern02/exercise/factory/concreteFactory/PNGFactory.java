package FactoryMethodPattern02.exercise.factory.concreteFactory;

import FactoryMethodPattern02.exercise.product.concreteFactory.PNG;
import FactoryMethodPattern02.exercise.product.Picture;
import FactoryMethodPattern02.exercise.factory.PictureFactory;

public class PNGFactory extends PictureFactory {
    @Override
    public Picture createPicture() {
        return new PNG();
    }
}
