package com.emexo.BasicIO;

import java.io.IOException;

public class MainProp {

    public static void main(String[] args) throws IOException {

        ByteReadWriteProperties obj = new ByteReadWriteProperties();
        obj.readAndWriteProperties("C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\BasicIO\\file.properties","C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\BasicIO\\output.properties");
    }
}
