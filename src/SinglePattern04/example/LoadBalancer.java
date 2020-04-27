package SinglePattern04.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private static LoadBalancer instance;
    private List serverList;
    private Random random;

    //将构造器设为私有,禁止外部实例化
    private LoadBalancer(){
        serverList = new ArrayList();
        random = new Random();
    }

    public static LoadBalancer getInstance(){
        if(instance == null){
            instance = new LoadBalancer();
        }
        return instance;
    }

    public void addServer(String server){
        serverList.add(server);
    }

    public void removeServer(String server){
        serverList.remove(server);
    }

    public String getServer(){
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }

}
