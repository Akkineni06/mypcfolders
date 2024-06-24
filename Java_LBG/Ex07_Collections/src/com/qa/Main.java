package com.qa;
import java.sql.SQLOutput;
import java.util.*;

import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;
import com.qa.model.Animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat c1 = new Cat ("Tilly", 10);
        Cat c2 = new Cat ("Leo", 8);
        Dog d1 = new Dog ("Bruce", 2);
        Rabbit r1 = new Rabbit("Peter", 2);
        Rabbit r2 = new Rabbit("Jonny", 3);

        ArrayList<Animal>animalList = new ArrayList<>();
        animalList.add(c1);
        animalList.add(c2);
        animalList.add(d1);
        animalList.add(r1);
        animalList.add(r2);
        ArrayList<Cat>catList = new ArrayList<>();
        catList.add(c1);
        catList.add(c2);

        System.out.println("For Loop on ArrayList");
        for (int x = 0; x < animalList.size(); x++) {
            System.out.println(animalList.get(x));
        }

        HashMap<String, Animal> animalMap = new HashMap<>();
        animalMap.put(c1.getName(), c1);
        animalMap.put(c2.getName(), c2);
        animalMap.put(d1.getName(), d1);
        animalMap.put(r1.getName(), r1);
        animalMap.put(r2.getName(), r2);

        HashMap<Animal, String> animalMap2 = new HashMap<>();
        animalMap2.put(c1, "Fluffy");
        animalMap2.put(c2, "Doesn't like being picked up");
        animalMap2.put(d1, "Overly excited about running");
        animalMap2.put(r1, "Snuffles a lot, may have a cold");
        animalMap2.put(r2, "May actually be evil. Unsure.");
        System.out.println("\nFor each loop on the animal map values");
        for (String key : animalMap.keySet()) {
            System.out.println(" Key: " + key + " Value " + animalMap.get(key));
        }


        HashSet<Animal> set = new HashSet<>();
//we can just add all the elements of another collection
        set.addAll(animalList);
        set.add(c1); // replaces the previous version of the cat
        set.add(c2);






    }
}
