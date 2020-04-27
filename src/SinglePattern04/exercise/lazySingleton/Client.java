package SinglePattern04.exercise.lazySingleton;

import SinglePattern04.exercise.eagerSingleton.EagerLoadBalancer;

import java.util.stream.Stream;

/**
 *              采用懒汉模式来进行单例化,但必须使用双重认证,才能保证线程安全.
 *              第一次进行实例化时,由于需要保证多线程安全,故资源消耗过大..
 */

public class Client {

     public void f(){
         System.out.println(LazyLoadBalancer.getInstance());
     }

    public static void main(String[] args) {
        Client client = new Client();
        Stream.of("t1","t2","t3","t4","t5","t6")
                .forEach(name->new Thread(()->{
                        client.f();
                        System.out.println("当前线程:" +Thread.currentThread().getName()+ "创建实例对象");
                    },name).start()
                );

    }
}
