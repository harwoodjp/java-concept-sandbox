package com.harwoodjp.Classes;
import com.harwoodjp.AbstractClasses.AnimalAbstract;

public class Cat extends AnimalAbstract {

    public String noise = "meow";

    public Cat(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println(noise);
    }

    //@Override
    public void tellAJoke() {
        System.out.println("I'm meow-t of patience for you.");
    }

}
