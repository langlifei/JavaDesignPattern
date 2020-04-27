package SinglePattern04.exercise.lazySingleton;

import SinglePattern04.exercise.eagerSingleton.EagerLoadBalancer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LazyLoadBalancer {
    private static LazyLoadBalancer instance;
    private List serverList;
    private Random random;

    private LazyLoadBalancer(){
        serverList = new ArrayList();
        random = new Random();
    }

    public static LazyLoadBalancer getInstance(){
        if(instance == null){
            synchronized (LazyLoadBalancer.class){
                if(instance==null)
                    instance = new LazyLoadBalancer();
            }
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
