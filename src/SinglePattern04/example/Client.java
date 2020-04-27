package SinglePattern04.example;

/**
 *              仅使用于单线程情形...
 *              如果处于多线程环境下则不满足单例模式的特性
 */

public class Client {

    public static void main(String[] args) {
        LoadBalancer loadBalancer1 = LoadBalancer.getInstance();
        LoadBalancer loadBalancer2 = LoadBalancer.getInstance();
        LoadBalancer loadBalancer3 = LoadBalancer.getInstance();
        LoadBalancer loadBalancer4 = LoadBalancer.getInstance();

        //判断服务器负载均衡器是否相同
        if(loadBalancer1==loadBalancer2&&loadBalancer2==loadBalancer3&&loadBalancer3==loadBalancer4)
            System.out.println("服务器负载均衡器具有一致性");

        //增加服务器
        loadBalancer1.addServer("Server 1");
        loadBalancer1.addServer("Server 2");
        loadBalancer1.addServer("Server 3");
        loadBalancer1.addServer("Server 4");
        loadBalancer1.addServer("Server 5");
        for(int i = 0 ; i < 10 ; i++)
            System.out.println("分发请求至服务器:" + loadBalancer2.getServer());
    }
}
