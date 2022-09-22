package com.emexo.exampleabstract;

public class Main {

    public static void main(String[] args) {
        Bios obj = new AMD("AMD chipset");
        obj.startFlash("Bios flashing");
        obj.stopFlash("Bios interrupted");
        obj.OEM();

        Bios ex = new Intel("Intel chipset");
        ex.startFlash("Intel bios flashing");
        ex.stopFlash("Intel bios failure");
        ex.OEM();
    }
}
