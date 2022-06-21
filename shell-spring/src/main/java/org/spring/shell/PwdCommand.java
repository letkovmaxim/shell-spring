package org.spring.shell;

public class PwdCommand implements Command {
    @Override
    public String getName () {
        return "PWD" ;
    }

    @Override
    public void exec () {
        System.out.println( "[ Текущий рабочий каталог: \"" + System.getProperty( "user.dir" ) + "\" ] " ) ;
    }
}