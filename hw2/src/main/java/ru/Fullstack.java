package ru;

public class Fullstack extends Developer implements Backendable, Frontendable{
    public Fullstack(String name, int age) {
        super(name, age);
    }

    @Override
    public void doBackendWork() {

        System.out.println("Very bad backend  work");
    }

    @Override
    public void doFrontendWork() {
        System.out.println("Good frontend work!!!");
    }
}
