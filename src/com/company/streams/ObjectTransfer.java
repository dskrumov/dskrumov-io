package com.company.streams;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ObjectTransfer {

    /**
     * Read from the array which is defined in main method and writes the data with specific length
     * and offset in the streamTEST.txt
     *
     * @throws IOException
     */
  /*   public void transfer(String inputFileName, int offset, int length) throws IOException {
        DirectoryBrowser path = Paths.get(inputFileName);
        byte[] data = Files.readAllBytes(path);
        InputStream inputStream = new ByteArrayInputStream(data);
        outputStream.write(data, offset, length);
        outputStream.flush();

    }*/
    public void transfer2(InputStream inputStream, OutputStream outputStream, int offset, int size) throws IOException {
        int b;

        while ((b = inputStream.read()) != -1) {

            System.out.printf("%02x ", b);
            inputStream.skip(2);
           outputStream.write(size);
            outputStream.write(b);
        }


    }
}
