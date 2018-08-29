package com.harwoodjp.Classes;

import java.util.ArrayList;

public class PetOwner {

    private ArrayList<Cat> cats = new ArrayList<Cat>();
    private ArrayList<Dog> dogs = new ArrayList<Dog>();

    public void setCat(Cat cat) {
        this.cats.add(cat);
    }
    public void setDog(Dog dog) {
        this.dogs.add(dog);
    }

    public void printPets() {
        System.out.println("Cats: " + this.cats.toString());
        System.out.println("Dogs: " + this.dogs.toString());
    }

    public void printPetsNames() {
        System.out.print("Cats: ");
        for (int i = 0; i < this.cats.size(); i++) {
            System.out.print(this.cats.get(i).getName() + " ");
        }
        System.out.println("");
        System.out.print("Dogs: ");
        for (int i = 0; i < this.dogs.size(); i++) {
            System.out.print(this.dogs.get(i).getName() + " ");
        }
    }
}
