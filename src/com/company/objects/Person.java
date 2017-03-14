package com.company.objects;

import java.io.*;

public class Person implements Serializable {


    private String name;

    public void serialize(String name) throws IOException {
        name = this.name;

        OutputStream outStream = new FileOutputStream("person.ser");
        ObjectOutputStream stdObjectOut = new ObjectOutputStream(outStream);
        stdObjectOut.writeObject(name);
        stdObjectOut.close();
        outStream.close();
    }


}
