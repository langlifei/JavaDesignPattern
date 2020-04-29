package BridgePattern08.exercise.service.concreteService;

import BridgePattern08.exercise.service.FileImp;

public class SQLServerFileImp implements FileImp {
    @Override
    public void readData() {
        System.out.println("从SQLServer中读取数据....");
    }
}
