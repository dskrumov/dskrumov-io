package com.company.reversedocument;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new File("read(Reverse-exercise).txt").reverseContentInto("write(Reverse-exercise).txt");
    }
}