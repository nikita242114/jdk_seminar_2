package ru;

import java.util.ArrayList;

public abstract class Developer  {
    String name;
    int age;


    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void developGUI(ArrayList<Developer> e){
        for (Developer d:e) {
            if(d instanceof Frontender) {
                ((Frontender) d).doFrontendWork();
                System.out.println("Этот фронтенд- разработчик хорошо выполняет работу");
            }
        }
//        else if(e instanceof Backender){
//            ((Backender) e).doBackendWork();
//        }
    }


}
