package ObserverPattern19.subject;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {

    protected String name;
    protected Set<Object> list = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void join(Object obj){
        if(obj != null)
            list.add(obj);
    }

    public void quit(Object obj){
        if(list.contains(obj))
            list.remove(obj);
    }

    public abstract void notifyObservers(String name);
}
