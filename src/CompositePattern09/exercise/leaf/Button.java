package CompositePattern09.exercise.leaf;

import CompositePattern09.exercise.component.AbstractComponent;

/**
 * @Author Zeng Zhuo
 * @Date 2020/4/30 11:24
 * @Describe
 */

public class Button implements AbstractComponent {

    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("对" + this.name + "进行点击....");
    }
}
