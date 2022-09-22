package com.emexo.BasicIO;

import java.io.IOException;

public class MainReader {

    public static void main(String[] args) throws IOException {
        BuffReader obj = new BuffReader();
        obj.readAndWriteFileWithTryWithResource("C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\BasicIO\\input.txt", "C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\BasicIO\\outputBuff.txt");
    }
}
