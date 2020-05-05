package CommandPattern15.example.button;

import CommandPattern15.example.command.Command;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/5 12:57
 * @Describe
 */

public class FunctionButton {

    private Command command;
    private String name;

    public FunctionButton(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void onClick(){
        System.out.print("显示功能键--" + this.name+":");
        this.command.execute();
    }
}
