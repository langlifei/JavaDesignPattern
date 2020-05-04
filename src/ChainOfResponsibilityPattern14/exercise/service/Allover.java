package ChainOfResponsibilityPattern14.exercise.service;

import ChainOfResponsibilityPattern14.exercise.entity.Vacation;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 17:03
 * @Describe
 */

public abstract class Allover {

    protected String name;
    protected Allover allover;

    public Allover(String name) {
        this.name = name;
    }

    public void setAllover(Allover allover) {
        this.allover = allover;
    }

    public abstract String approval(Vacation vacation);

}
