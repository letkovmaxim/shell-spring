package org.spring.shell;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime ;
import java.time.format.DateTimeFormatter ;

@Component
public class DateCommand implements Command {
    @Override
    public String getName() {
        return "DATE";
    }

    @Override
    public void exec () {
        LocalDateTime now = LocalDateTime.now() ;
        DateTimeFormatter df = DateTimeFormatter.ofPattern( "d/M/y" ) ;

        System.out.println( "[ Текущая дата: " + now.format( df ) + " ] " ) ;
    }
}