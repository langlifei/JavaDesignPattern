package BridgePattern08.example;

import BridgePattern08.example.action.Image;
import BridgePattern08.example.service.ImageImp;

public class Client {

    public static void main(String[] args) {
        Image image = (Image) XMLUtil.getBean("image");
        ImageImp imageImp= (ImageImp) XMLUtil.getBean("os");
        image.setImageImp(imageImp);
        image.parseFile("小龙女");
    }
}
