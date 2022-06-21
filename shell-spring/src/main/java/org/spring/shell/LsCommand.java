package org.spring.shell;

import java.io.* ;

public class LsCommand implements Command {
    @Override
    public String getName () {
        return "LS";
    }

    @Override
    public void exec () {
        File directoryPath = new File( System.getProperty("user.dir"));
        String[] contents = directoryPath.list();

        System.out.print("[ Содержимое текущего рабочего каталога: ");
        if (contents != null) {
            for (int i = 0; i < contents.length - 1; i++) {
                System.out.print("\"" + contents[i] + "\" ");
            }
        }
        System.out.println("]");
    }
}
