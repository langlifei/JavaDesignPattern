package IteratorPattern16.example;

import IteratorPattern16.example.iterator.AbstractIterator;
import IteratorPattern16.example.list.AbstractObjectList;
import IteratorPattern16.example.list.concreteList.ProductList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/5 13:40
 * @Describe
 */

public class Client {

    public static void main(String[] args) {
        List products  = new ArrayList();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");
        AbstractObjectList abstractObjectList = new ProductList(products);
        AbstractIterator iterator = abstractObjectList.createIterator();
        System.out.println("正向遍历:");
        while(!iterator.isLast()){
            System.out.println(iterator.getNextItem()+" , ");
            iterator.next();
        }
        System.out.println("---------------------------");
        System.out.println("逆向遍历");
        while(!iterator.isFirst()){
            System.out.println(iterator.getPreviousItem()+" , ");
            iterator.previous();
        }
    }
}
