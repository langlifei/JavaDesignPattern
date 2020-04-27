package SinglePattern04.exercise.eagerSingleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EagerLoadBalancer {
    private static EagerLoadBalancer instance = new EagerLoadBalancer();
    private List serverList;
    private Random random;

    private EagerLoadBalancer(){
        serverList = new ArrayList();
        random = new Random();
    }

    public static EagerLoadBalancer getInstance(){
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
