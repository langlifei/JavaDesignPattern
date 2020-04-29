package BridgePattern08.exercise;

import BridgePattern08.exercise.action.File;
import BridgePattern08.exercise.service.FileImp;

public class Client {

    public static void main(String[] args) {
        File file = (File) XMLUtil.getBean("file");
        FileImp fileImp= (FileImp) XMLUtil.getBean("database");
        file.setFileImp(fileImp);
        file.transform();
    }
}
