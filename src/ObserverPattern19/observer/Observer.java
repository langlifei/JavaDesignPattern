package ObserverPattern19.observer;

import ObserverPattern19.subject.Subject;

public abstract class Observer {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void update();

    public abstract void updateState(Subject subject);

}
