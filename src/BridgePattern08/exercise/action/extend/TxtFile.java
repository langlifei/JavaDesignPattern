package BridgePattern08.exercise.action.extend;

import BridgePattern08.exercise.action.File;

public class TxtFile extends File {
    @Override
    public void transform() {
        fileImp.readData();
        System.out.println("将数据转换为txt格式....");
    }
}
