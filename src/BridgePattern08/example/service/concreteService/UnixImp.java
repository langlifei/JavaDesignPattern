package BridgePattern08.example.service.concreteService;

import BridgePattern08.example.Matrix;
import BridgePattern08.example.service.ImageImp;

public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在Unix上显示....");
    }
}
