package com.emexo.BasicIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ByteReadWriteResource {

    public void readAndWriteProperties (String inputFile, String outputFile) throws IOException {
        Properties props = new Properties();
        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputStream = new FileOutputStream(outputFile);){  // try with resource
            int data;
            while( (data = inputStream.read()) != -1){
                outputStream.write(data);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

