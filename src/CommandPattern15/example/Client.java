package CommandPattern15.example;

import BuilderPattern06.example.builder.ActorBuilder;
import BuilderPattern06.example.controller.ActorController;
import BuilderPattern06.example.entity.Actor;
import CommandPattern15.example.button.FBSettingWindow;
import CommandPattern15.example.button.FunctionButton;
import CommandPattern15.example.command.Command;

public class Client {

    public static void main(String[] args) {
        FBSettingWindow fbSettingWindow = new FBSettingWindow("功能键设置");
        FunctionButton functionButton = new FunctionButton("功能键1");
        FunctionButton functionButton1 = new FunctionButton("功能键2");
        FunctionButton functionButton2 = new FunctionButton("功能键3");
        fbSettingWindow.addFunctionButton(functionButton);
        fbSettingWindow.addFunctionButton(functionButton1);
        fbSettingWindow.addFunctionButton(functionButton2);
        fbSettingWindow.display();
        System.out.println("进行点击测试.....");
        Command command1 = (Command) XMLUtil.getBean("fun1");
        Command command2 = (Command) XMLUtil.getBean("fun2");
        functionButton.setCommand(command1);
        functionButton.onClick();
        functionButton1.setCommand(command1);
        functionButton1.onClick();
        functionButton2.setCommand(command2);
        functionButton2.onClick();
    }


}
