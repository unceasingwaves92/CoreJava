package com.emexo.BasicIO;

import java.io.*;

public class BuffReader {

    public void readAndWriteFileWithTryWithResource(String inputFile, String outputFile) throws IOException {

        try (BufferedReader inputStream = new BufferedReader( new FileReader(inputFile));
             BufferedWriter outputStream = new BufferedWriter(new FileWriter(outputFile));){  // try with resource
            String data;
            while( (data = inputStream.readLine()) != null){
                outputStream.write(data);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}


