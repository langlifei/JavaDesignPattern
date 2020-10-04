package ObserverPattern19.observer.concreteObserver;

import ObserverPattern19.observer.Observer;
import ObserverPattern19.subject.Subject;

public class Player extends Observer {

    public Player(String name){
        super.name = name;
    }

    @Override
    public void update() {
        System.out.println("坚持住," + this.name + "来救你!");
    }

    @Override
    public void updateState(Subject subject) {
        System.out.println(this.name + "被攻击!");
        subject.notifyObservers(this.name);
    }
}
