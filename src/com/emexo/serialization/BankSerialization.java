package com.emexo.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BankSerialization {
    public static final String fileName="C:\\Users\\Dell\\IdeaProjects\\Emexo\\src\\com\\emexo\\serialization\\bank.ser";

    /*
    * serialize the bank object
    * @param bank
    */

    public void serialize(Bank bank){

        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {
            outputStream.writeObject(bank);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Serialized the bank object");
    }

    /**
     * Deserialize the bank object
     * @return
     */
    public Bank deserialize() {
        Bank bank = null;
        try(FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            bank = (Bank) objectInputStream.readObject();
        }catch(Exception ex){
            ex.printStackTrace();
        }

        return bank;
    }
}
