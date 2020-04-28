package PrototypePattern05.example;

import PrototypePattern05.example.pattern.PrototypeManager;
import PrototypePattern05.example.product.OfficialDocument;

import java.util.Optional;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {
        OfficialDocument officialDocument = (OfficialDocument) XMLUtil.getBean();
        String key = officialDocument.getClass().getSimpleName();
        PrototypeManager prototypeManager = PrototypeManager.getPrototypeManager();
        prototypeManager.add(key,officialDocument);
        OfficialDocument obj1 = prototypeManager.getOfficialDocument(key);
        OfficialDocument obj2 = prototypeManager.getOfficialDocument(key);
        OfficialDocument obj3 = prototypeManager.getOfficialDocument(key);
        Stream.of(officialDocument,obj1,obj2,obj3)
                .forEach(t->{
                    t.display();
                });
    }
}
