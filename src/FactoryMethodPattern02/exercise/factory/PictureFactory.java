package FactoryMethodPattern02.exercise.factory;

import FactoryMethodPattern02.exercise.product.Picture;

public abstract class PictureFactory {
    public abstract Picture createPicture();

    public void read(){
        Picture picture = this.createPicture();
        picture.read();
    }
}
