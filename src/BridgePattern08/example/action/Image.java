package BridgePattern08.example.action;

import BridgePattern08.example.service.ImageImp;

public abstract class Image {

    protected ImageImp imageImp;

    public void setImageImp(ImageImp imageImp) {
        this.imageImp = imageImp;
    }

    public abstract void parseFile(String fileName);
}
