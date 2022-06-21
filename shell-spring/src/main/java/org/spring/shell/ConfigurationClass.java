package org.spring.shell;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    @Bean
    public TimeCommand getTimeCommand() {
        return new TimeCommand();
    }

    @Bean
    public DateCommand getDateCommand() {
        return new DateCommand();
    }

    @Bean
    public PwdCommand getPwdCommand() {
        return new PwdCommand();
    }

    @Bean
    public LsCommand getLsCommand() {
        return new LsCommand();
    }

    @Bean
    public ExitCommand getExitCommand() {
        return new ExitCommand();
    }

    @Bean
    public ShellManager getShellManager() {
        return new ShellManager();
    }
}
