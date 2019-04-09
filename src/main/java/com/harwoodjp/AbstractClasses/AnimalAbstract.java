package com.harwoodjp.AbstractClasses;

public abstract class AnimalAbstract {

    public String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void sayHello() {
        System.out.println("Hello, I am an animal.");
    }

    public abstract void tellAJoke();
}
