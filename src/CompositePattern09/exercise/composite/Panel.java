package CompositePattern09.exercise.composite;

import CompositePattern09.exercise.component.AbstractComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 11:17
 * @Describe
 */

public class Panel implements AbstractComponent {
    private List<AbstractComponent> componentList;
    private String name;

    public Panel(String name,List<AbstractComponent> componentList) {
        this.name = name;
        this.componentList = componentList;
    }


    public Panel(String name){
        this.name = name;
        this.componentList = new ArrayList<>();
    }

    @Override
    public void operation() {
        System.out.println("对" + this.name + "进行操作....");
        for(AbstractComponent component : this.componentList)
            component.operation();
    }

    public void add(AbstractComponent abstractComponent){
        this.componentList.add(abstractComponent);
    }

    public void remove(AbstractComponent abstractComponent){
        this.componentList.remove(abstractComponent);
    }

    public AbstractComponent getComponent(int i){
        return this.componentList.get(i);
    }
}
