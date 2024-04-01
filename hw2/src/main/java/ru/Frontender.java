package ru;

public class Frontender extends Developer implements Backendable,Frontendable{
    public Frontender(String name, int age) {
        super(name, age);
    }

    @Override
    public void doFrontendWork() {
        System.out.println("Good frontend work!!!");
    }

    @Override
    public void doBackendWork() {
        System.out.println("Very bad backend work!!!");
    }

//    public void developGUI(){
//        System.out.println("создать GUI");
//    }
}