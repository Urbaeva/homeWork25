package com.company.tap_25_2;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        HashSet<City> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            hashSet.add(new City(random.nextInt(1000, 10000), "City" + (i+1), random.nextInt(1000000, 1000000000)));
        }
        System.out.println(hashSet);

        TreeSet<City> treeSet = new TreeSet<>();
        for (City i: hashSet) {
            if (i.getCode()%2 != 0){
                treeSet.add(i);
            }
        }
        System.out.println(treeSet);
    }
}
