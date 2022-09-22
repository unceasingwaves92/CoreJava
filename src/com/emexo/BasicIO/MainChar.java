package com.emexo.BasicIO;

import java.io.IOException;

public class MainChar {

    public static void main(String[] args) throws IOException {
        CharacterStream obj = new CharacterStream();
        obj.readAndWriteFile("C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\BasicIO\\input.txt", "C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\BasicIO\\output.pdf");

    }
}
