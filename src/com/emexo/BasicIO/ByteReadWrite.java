package com.emexo.BasicIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteReadWrite {


    public void readAndWriteFile(String input, String output) throws IOException {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {

            inputStream = new FileInputStream(input);
            outputStream = new FileOutputStream(output);
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();

        }

    }
}
