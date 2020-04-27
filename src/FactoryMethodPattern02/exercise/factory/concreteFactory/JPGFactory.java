package FactoryMethodPattern02.exercise.factory.concreteFactory;

import FactoryMethodPattern02.exercise.product.concreteFactory.JPG;
import FactoryMethodPattern02.exercise.product.Picture;
import FactoryMethodPattern02.exercise.factory.PictureFactory;

public class JPGFactory extends PictureFactory {
    @Override
    public Picture createPicture() {
        return new JPG();
    }
}
