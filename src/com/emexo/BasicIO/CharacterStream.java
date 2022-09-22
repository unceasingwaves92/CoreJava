package com.emexo.BasicIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

    public void readAndWriteFile(String inputFile, String outputFile) throws IOException {

        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile);) {
            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
