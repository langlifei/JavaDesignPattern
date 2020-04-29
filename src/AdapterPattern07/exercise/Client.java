package AdapterPattern07.exercise;

import AdapterPattern07.example.action.ScoreOperation;
import AdapterPattern07.exercise.action.EncryptionOperation;

public class Client {

    public static void main(String[] args) {
        EncryptionOperation encryptionOperation = (EncryptionOperation) XMLUtil.getBean();
        encryptionOperation.encrypt();
    }
}
