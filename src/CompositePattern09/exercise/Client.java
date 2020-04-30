package CompositePattern09.exercise;

import CompositePattern09.exercise.component.AbstractComponent;
import CompositePattern09.exercise.composite.Panel;
import CompositePattern09.exercise.composite.Window;
import CompositePattern09.exercise.leaf.Button;
import CompositePattern09.exercise.leaf.TextFiled;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 11:27
 * @Describe
 */

public class Client {

    public static void main(String[] args) {
        Panel panel1 = new Panel("1号面板");
        AbstractComponent button1 = new Button("1号按钮");
        AbstractComponent textFiled1 = new TextFiled("1号文本框");
        panel1.add(button1);
        panel1.add(textFiled1);
        Panel panel2 = new Panel("2号面板");
        AbstractComponent button2 = new Button("2号按钮");
        AbstractComponent textFiled2 = new TextFiled("2号文本框");
        panel2.add(button2);
        panel2.add(textFiled2);
        Window window = new Window("窗体..");
        window.add(panel1);
        window.add(panel2);
        window.operation();
    }
}
