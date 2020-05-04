package ChainOfResponsibilityPattern14.example.service;

import ChainOfResponsibilityPattern14.example.entity.PurchaseRequest;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 16:40
 * @Describe
 */

public abstract class Allover {

    protected Allover allover;
    protected String name;

    public Allover(String name) {
        this.name = name;
    }

    public void setAllover(Allover allover) {
        this.allover = allover;
    }

    public abstract void processRequest(PurchaseRequest request);
}
