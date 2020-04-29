package BridgePattern08.example.service.concreteService;

import BridgePattern08.example.Matrix;
import BridgePattern08.example.service.ImageImp;

public class LinuxImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在linux上显示图像....");
    }
}
