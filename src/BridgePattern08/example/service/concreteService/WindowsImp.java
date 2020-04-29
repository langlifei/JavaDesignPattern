package BridgePattern08.example.service.concreteService;

import BridgePattern08.example.Matrix;
import BridgePattern08.example.service.ImageImp;

public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在win上显示图像...");
    }
}
