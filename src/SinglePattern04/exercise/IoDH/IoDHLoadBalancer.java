package SinglePattern04.exercise.IoDH;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IoDHLoadBalancer {

    private static IoDHLoadBalancer instance ;
    private List serverList;
    private Random random;

    private static class HolderClass{
        private final static IoDHLoadBalancer IoDH_LOAD_BALANCER = new IoDHLoadBalancer();
    }

    private IoDHLoadBalancer(){
        serverList = new ArrayList();
        random = new Random();
    }


    public static IoDHLoadBalancer getInstance(){
        return HolderClass.IoDH_LOAD_BALANCER;
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
