package PrototypePattern05.exercise.product.concreteProduct;

import java.io.*;

public class WeeklyLog implements Serializable{
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    private WeeklyLog(){

    }

    private static class WeeklyLogHolder{
        private final static WeeklyLog weeklyLog = new WeeklyLog();
    }

    public static WeeklyLog getWeeklyLog(){
         return WeeklyLogHolder.weeklyLog;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //使用序列化进行深复制....
    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLog) ois.readObject();
    }

}
