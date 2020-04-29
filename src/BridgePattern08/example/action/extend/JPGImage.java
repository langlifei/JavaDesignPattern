package BridgePattern08.example.action.extend;

import BridgePattern08.example.Matrix;
import BridgePattern08.example.action.Image;

public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageImp.doPaint(matrix);
        System.out.println("文件名为:" + fileName + ",格式为jpg");
    }
}
