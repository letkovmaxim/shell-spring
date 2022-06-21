package org.spring.shell;

import java.time.LocalDateTime ;
import java.time.format.DateTimeFormatter ;

public class TimeCommand implements Command {
    @Override
    public String getName() {
        return "TIME";
    }

    @Override
    public void exec() {
        LocalDateTime now = LocalDateTime.now() ;
        DateTimeFormatter df = DateTimeFormatter.ofPattern( "H:m:ss" ) ;

        System.out.println( "[ Текущее время: " + now.format( df ) + " ] " ) ;
    }
}
