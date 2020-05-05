package IteratorPattern16.example.iterator;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/5 13:28
 * @Describe
 */

public interface AbstractIterator {

    void next();
    boolean isLast();
    void previous();
    boolean isFirst();
    Object getNextItem();
    Object getPreviousItem();
}
