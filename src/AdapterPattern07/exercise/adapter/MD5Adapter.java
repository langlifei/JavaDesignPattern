package AdapterPattern07.exercise.adapter;

import AdapterPattern07.exercise.action.EncryptionOperation;
import AdapterPattern07.exercise.adapter.adaptee.MD5;

public class MD5Adapter implements EncryptionOperation {

    private MD5 md5;

    public MD5Adapter(){
        this.md5 = new MD5();
    }

    @Override
    public void encrypt() {
        this.md5.md5();
    }
}
