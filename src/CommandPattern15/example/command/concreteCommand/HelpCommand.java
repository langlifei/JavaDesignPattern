package CommandPattern15.example.command.concreteCommand;

import CommandPattern15.example.command.Command;
import CommandPattern15.example.service.HelpHandler;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/5 13:17
 * @Describe
 */

public class HelpCommand implements Command {

    private HelpHandler helpHandler;

    public HelpCommand() {
        this.helpHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        this.helpHandler.display();
    }
}
