package com.harwoodjp.Classes;

public class Puppy extends Dog {
    Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void sayAge() {
        System.out.println("I'm only " + this.age + " years old.");
    }

}
