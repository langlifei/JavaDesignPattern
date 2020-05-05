package IteratorPattern16.example.iterator.concreteIterator;

import IteratorPattern16.example.iterator.AbstractIterator;
import IteratorPattern16.example.list.concreteList.ProductList;

import java.util.List;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/5 13:31
 * @Describe
 */

public class ProductIterator implements AbstractIterator {
    private ProductList productList;
    private List products;
    private int cursor1;
    private int cursor2;

    public ProductIterator(ProductList productList) {
        this.productList = productList;
        this.products = productList.getObjects();
        this.cursor1 = 0;
        this.cursor2 = this.products.size()-1;
    }

    @Override
    public void next() {
        if(cursor1<products.size())
            cursor1++;
    }

    @Override
    public boolean isLast() {
        return (cursor1==products.size());
    }

    @Override
    public void previous() {
        if(cursor2>-1)
            cursor2--;
    }

    @Override
    public boolean isFirst() {
        return (cursor2==-1);
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
