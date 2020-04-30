package CompositePattern09.exercise.leaf;

import CompositePattern09.example.leaf.TextFile;
import CompositePattern09.exercise.component.AbstractComponent;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 11:29
 * @Describe
 */

public class TextFiled implements AbstractComponent {

    private String name;

    public TextFiled(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("对" + this.name + "进行输入....");
    }
}
