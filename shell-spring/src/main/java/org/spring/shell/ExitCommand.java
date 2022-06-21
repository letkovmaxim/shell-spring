package org.spring.shell;

public class ExitCommand implements Command {
    @Override
    public String getName() {
        return "EXIT";
    }

    @Override
    public void exec() {
        System.out.println("[ Выход ]");
        System.exit(0);
    }
}