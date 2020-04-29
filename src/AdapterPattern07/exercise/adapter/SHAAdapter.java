package AdapterPattern07.exercise.adapter;

import AdapterPattern07.exercise.action.EncryptionOperation;
import AdapterPattern07.exercise.adapter.adaptee.SHA;

public class SHAAdapter implements EncryptionOperation {

    private SHA sha;

    public SHAAdapter(){
        this.sha = new SHA();
    }

    @Override
    public void encrypt() {
        this.sha.sha1();
    }
}
