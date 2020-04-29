package BridgePattern08.example.action.extend;

import BridgePattern08.example.Matrix;
import BridgePattern08.example.action.Image;

public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageImp.doPaint(matrix);
        System.out.println("名字:" + fileName + " 格式为:BMP");
    }
}
