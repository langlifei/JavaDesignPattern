package PrototypePattern05.exercise;

import PrototypePattern05.exercise.product.concreteProduct.Attachment;
import PrototypePattern05.exercise.product.concreteProduct.WeeklyLog;

import java.io.IOException;

/**
 *          使用流进行原型模式中的深度复制......
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WeeklyLog weeklyLog = WeeklyLog.getWeeklyLog();
        weeklyLog.setAttachment(new Attachment());
        weeklyLog.getAttachment().setName("attachment");
        WeeklyLog w1 = weeklyLog.deepClone();
        WeeklyLog w2 = weeklyLog.deepClone();
        WeeklyLog w3 = weeklyLog.deepClone();
        System.out.println(w1==w2);
        System.out.println(w2==w3);
        System.out.println(w1.getAttachment()==w2.getAttachment());
        System.out.println(w1.getAttachment().getName().equals(w2.getAttachment().getName()));
    }
}
