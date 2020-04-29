package BridgePattern08.exercise.service.concreteService;

import BridgePattern08.exercise.service.FileImp;

public class MysqlFileImp implements FileImp {
    @Override
    public void readData() {
        System.out.println("从mysql中读入数据信息");
    }
}
