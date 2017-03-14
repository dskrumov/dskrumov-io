package com.company.directorycontent;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DirectoryBrowser path = new DirectoryBrowser();
        path.listContent("/home/clouway/Music");

    }
}
