package FactoryMethodPattern02.exercise.factory.concreteFactory;

import FactoryMethodPattern02.exercise.product.concreteFactory.GIF;
import FactoryMethodPattern02.exercise.product.Picture;
import FactoryMethodPattern02.exercise.factory.PictureFactory;

public class GifFactory extends PictureFactory {

    @Override
    public Picture createPicture() {
        return new GIF();
    }
}
