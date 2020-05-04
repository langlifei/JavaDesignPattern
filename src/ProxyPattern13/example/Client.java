package ProxyPattern13.example;

import PrototypePattern05.example.pattern.PrototypeManager;
import PrototypePattern05.example.product.OfficialDocument;
import ProxyPattern13.example.service.Searcher;

import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {
        Searcher searcher = (Searcher) XMLUtil.getBean();
        System.out.println(searcher.doSearch("浪里飞", "斗破苍穹"));
    }
}
