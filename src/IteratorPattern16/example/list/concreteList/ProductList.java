package IteratorPattern16.example.list.concreteList;

import IteratorPattern16.example.iterator.AbstractIterator;
import IteratorPattern16.example.iterator.concreteIterator.ProductIterator;
import IteratorPattern16.example.list.AbstractObjectList;

import java.util.List;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/5 13:31
 * @Describe
 */

public class ProductList extends AbstractObjectList {

    public ProductList(List objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
