package SinglePattern04.exercise.eagerSingleton;

import SinglePattern04.example.LoadBalancer;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *              在多线程环境下如果使用单线程的单例模式将破坏单例性.
 *              故采用饿汉模式,在类加载器对类进行初始化时,对其进行实例化,从而保证线程安全.
 *              但缺点是:无论有没有去获得该类的实例,它在类加载时一定会实例化,浪费了系统资源.
 */

public class Client {

     public void f(){
         System.out.println(EagerLoadBalancer.getInstance());
     }

    public static void main(String[] args) {
        Client client = new Client();
        Stream.of("t1","t2","t3")
                .forEach(name->new Thread(()->{
                        client.f();
                        System.out.println("当前线程:" +Thread.currentThread().getName()+ "创建实例对象");
                    },name).start()
                );

    }
}
