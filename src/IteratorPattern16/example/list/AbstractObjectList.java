package IteratorPattern16.example.list;

import IteratorPattern16.example.iterator.AbstractIterator;

import java.util.List;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/5 13:24
 * @Describe
 */

public abstract class AbstractObjectList {

    protected List<Object> objects;

    public AbstractObjectList(List objects) {
        this.objects = objects;
    }

    public void addObject(Object object){
        this.objects.add(object);
    }

    public void removeObject(Object object){
        this.objects.remove(object);
    }

    public List<Object> getObjects() {
        return objects;
    }

    public abstract AbstractIterator createIterator();
}
