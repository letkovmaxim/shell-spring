package org.spring.shell;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConfigurationClass.class);
        context.refresh();

        context.getBean(ShellManager.class).exec();
    }
}
