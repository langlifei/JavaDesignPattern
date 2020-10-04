package ObserverPattern19;

import ObserverPattern19.observer.Observer;
import ObserverPattern19.observer.concreteObserver.Player;
import ObserverPattern19.subject.Subject;
import ObserverPattern19.subject.concreteSubject.AllyControllerCenter;

public class Client {


    /**
     * 当被观察的目标发生改变时,通知所有观察该目标的观察者.
     * @param args
     */
    public static void main(String[] args) {
        Subject subject = new AllyControllerCenter("金庸群侠");
        Observer play1,play2,play3,play4;
        play1 = new Player("杨过");
        subject.join(play1);
        play2 = new Player("令狐冲");
        subject.join(play2);
        play3 = new Player("张无忌");
        subject.join(play3);
        play4 = new Player("段誉");
        subject.join(play4);
        play3.updateState(subject);
    }
}
