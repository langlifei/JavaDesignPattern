package ObserverPattern19.subject.concreteSubject;

import ObserverPattern19.observer.concreteObserver.Player;
import ObserverPattern19.subject.Subject;

public class AllyControllerCenter extends Subject {

    public AllyControllerCenter(String name){
        super.name = name;
        System.out.println(this.name + "战队创建成功");
        System.out.println("-----------------------");
    }

    @Override
    public void join(Object obj) {
        super.join(obj);
        Player player = (Player) obj;
        System.out.println(player.getName() + "加入金庸群侠战队!");
    }

    @Override
    public void notifyObservers(String name) {
        System.out.println(this.name + "战队紧急通知,盟友" + name + "遭受敌人攻击!");
        for (Object obj:list) {
            Player player = (Player) obj;
            if(!player.getName().equals(name))
                player.update();
        }
    }
}
