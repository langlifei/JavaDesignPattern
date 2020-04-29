package AdapterPattern07.example;

import AdapterPattern07.example.action.ScoreOperation;
import PrototypePattern05.example.pattern.PrototypeManager;
import PrototypePattern05.example.product.OfficialDocument;

import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {
        ScoreOperation scoreOperation = (ScoreOperation) XMLUtil.getBean();
        scoreOperation.sort();
        scoreOperation.search();
    }
}
