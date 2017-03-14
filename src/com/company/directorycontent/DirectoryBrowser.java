package com.company.directorycontent;


import java.io.File;
import java.io.IOException;

public class DirectoryBrowser {

    public String listContent(String path) throws IOException {

        File file = new File(path);
        File[] files = file.listFiles();

        if (file.isFile()) {
            return file.getName();
        } else if (file.isDirectory()) {

            for (int i = 0; i < files.length; i++) {
                files[i].getName();

            }
        }
        return null;
    }
}