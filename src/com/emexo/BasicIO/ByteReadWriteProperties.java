package com.emexo.BasicIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class ByteReadWriteProperties {

    public void readAndWriteProperties (String inputFile, String outputFile) throws IOException {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        Properties props = new Properties();


        try {
            inputStream = new FileInputStream(inputFile);
          //  props.load(inputStream);
         //   inputStream = new FileInputStream(props.getProperty("CONTENT"));
            outputStream = new FileOutputStream(outputFile);
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Properties file executed");
            inputStream.close();
            outputStream.close();

        }



    }
}
