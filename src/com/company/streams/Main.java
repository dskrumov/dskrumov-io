package com.company.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        ObjectTransfer objectTransfer = new ObjectTransfer();
        objectTransfer.transfer2(new FileInputStream("streamsTESTin.txt"),new FileOutputStream("streamsTESTout.txt"),2,4);


    }
}
