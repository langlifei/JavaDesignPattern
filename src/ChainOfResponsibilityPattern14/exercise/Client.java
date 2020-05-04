package ChainOfResponsibilityPattern14.exercise;

import ChainOfResponsibilityPattern14.exercise.entity.Vacation;
import ChainOfResponsibilityPattern14.exercise.service.Allover;
import ChainOfResponsibilityPattern14.exercise.service.serviceImp.Director;
import ChainOfResponsibilityPattern14.exercise.service.serviceImp.GeneralManager;
import ChainOfResponsibilityPattern14.exercise.service.serviceImp.Leader;

import java.lang.reflect.GenericArrayType;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/4 16:39
 * @Describe  有客户端来负责供应链的构造
 */

public class Client {

    public static void main(String[] args) {
        Allover director,leader,generalManager;
        director = new Director("张三");
        leader = new Leader("李四");
        generalManager = new GeneralManager("王五");
        director.setAllover(leader);
        leader.setAllover(generalManager);
        System.out.println(director.approval(new Vacation("浪里飞", 30, "生病")));
    }
}
