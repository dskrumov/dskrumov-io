package com.company.reversedocument;

import java.io.*;

public class File {
    /**
     * Fields
     */
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    /**
     * Create the file
     *
     * @param inputFile is the name of the created file
     */
    public File(String inputFile) throws FileNotFoundException {
        fileReader = new FileReader(inputFile);
        bufferedReader = new BufferedReader(fileReader);
    }


    /**
     * Reverse the contend from the previous created file by reading it
     *
     * @param outputFile is the name of the second document which will store the reversed information
     * @throws IOException
     */
    public void reverseContentInto(String outputFile) throws IOException {
        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

         String line;
         String temp = "";

        while ((line = bufferedReader.readLine()) != null) {
            StringBuffer stringBuffer = new StringBuffer(line);
            temp = stringBuffer.reverse().toString();
            bufferedWriter.write(temp + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}


