package ru;

public class Backender extends Developer implements Backendable, Frontendable{
    public Backender(String name, int age) {
        super(name, age);
    }

    @Override
    public void doBackendWork() {
        System.out.println("good backend work");
    }

    @Override
    public void doFrontendWork() {
        System.out.println("can't do frontend work");
    }
}
