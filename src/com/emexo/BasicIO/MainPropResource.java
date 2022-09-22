package com.emexo.BasicIO;

import java.io.IOException;

public class MainPropResource {

    public static void main(String[] args) throws IOException {

        ByteReadWriteResource obj = new ByteReadWriteResource();
        obj.readAndWriteProperties("C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\BasicIO\\file.properties","C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\BasicIO\\output.properties");
    }
}
