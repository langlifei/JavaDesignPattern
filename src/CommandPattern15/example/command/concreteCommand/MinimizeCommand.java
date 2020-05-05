package CommandPattern15.example.command.concreteCommand;

import CommandPattern15.example.command.Command;
import CommandPattern15.example.service.WindowHandler;

/**
 * @Author Zeng Zhuo
 * @Date 2020/5/5 13:03
 * @Describe
 */

public class MinimizeCommand implements Command {

    private WindowHandler windowHandler;

    public MinimizeCommand() {
        this.windowHandler = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHandler.minimize();
    }
}


