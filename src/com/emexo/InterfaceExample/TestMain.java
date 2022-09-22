package com.emexo.InterfaceExample;


public class TestMain {

    public static void main(String[] args) {
        CatLifeCycle ct = new Tiger();
        ct.aggressive();
        ct.speed();
        ct.nature();
        System.out.println(CatLifeCycle.noOfBreed);

        CatFamily cf = new Tiger();
        cf.run();
        cf.sound();
        CatFamily.catCycle();
        System.out.println(CatFamily.noOfCatFamily);

        CatLifeCycle ch = new Cheetah();
        ch.aggressive();
        ch.speed();
        ch.nature();
        System.out.println(CatLifeCycle.noOfBreed);

        CatFamily cft = new Cheetah();
        cft.run();
        cft.sound();
        CatFamily.catCycle();
        System.out.println(CatFamily.noOfCatFamily);

        CatLifeCycle cl = new Leopard();
        cl.aggressive();
        cl.speed();
        cl.nature();
        System.out.println(CatLifeCycle.noOfBreed);

        CatFamily cfh = new Leopard();
        cfh.run();
        cfh.sound();
        CatFamily.catCycle();
        System.out.println(CatFamily.noOfCatFamily);

    }
}
