package ru;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Backender back = new Backender("Artem",34);
        Frontender front = new Frontender("Anna",32);
        Fullstack full = new Fullstack("Olya",32);
        Backendable full2 = new Fullstack("Rik",29);
        Developer dev = new Frontender("DDDD",23);
        Developer dev2 = new Backender("VVVV", 23);
        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(back);
        developers.add(front);
        developers.add(dev);
        developers.add(dev2);



        Developer.developGUI(developers);
//        back.doBackendWork();
//        back.doFrontendWork();
//
//        front.doBackendWork();
//        front.doFrontendWork();
//
//        full.doBackendWork();
//        full.doFrontendWork();
//
//        full2.doBackendWork();

    }
}