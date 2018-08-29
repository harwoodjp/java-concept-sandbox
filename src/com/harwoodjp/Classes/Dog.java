package com.harwoodjp.Classes;
import com.harwoodjp.AbstractClasses.AnimalAbstract;
import com.harwoodjp.Interfaces.AnimalInterface;

public class Dog extends AnimalAbstract implements AnimalInterface {

    public Dog() {}

    public Dog(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, I'm a dog named " + this.name + ".");
    }

    public void tellAJoke() {
        System.out.println("Life is ruff.");
    }
}
