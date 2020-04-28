package PrototypePattern05.example.pattern;

import PrototypePattern05.example.product.OfficialDocument;

import java.util.concurrent.ConcurrentHashMap;

public class PrototypeManager {

    //保证线程安全性
    private ConcurrentHashMap<String,Object> chm;

    private PrototypeManager(){
        chm = new ConcurrentHashMap<>();
    }

    private static class PrototypeHolder{
        private final static PrototypeManager prototypeManager = new PrototypeManager();
    }

    public static PrototypeManager getPrototypeManager(){
        return PrototypeHolder.prototypeManager;
    }

    public void add(String key , OfficialDocument officialDocument){
        this.chm.put(key,officialDocument);
    }

    public OfficialDocument getOfficialDocument(String key){
        return ((OfficialDocument) this.chm.get(key)).clone();
    }
}
