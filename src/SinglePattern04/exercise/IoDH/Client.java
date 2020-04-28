package SinglePattern04.exercise.IoDH;

import java.util.stream.Stream;

/**
 *              IoDH:Initialization Demand Holder结合了懒汉和饿汉模式的优点,克服了它们的缺点.
 *              使用内部类和类加载来使得jvm保证了实例化时的线程安全性.
 */

public class Client {

     public void f(){
         System.out.println(IoDHLoadBalancer.getInstance());
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
