/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.*;
import java.io.*;

/**
 *
 * @author T
 */
public class J07030 {

    static boolean check(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream is1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream is2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) is1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) is2.readObject();
        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        TreeMap<Integer, Integer> map2 = new TreeMap<>();
        Collections.sort(list1);
        list1.forEach(x -> {
            if (check(x)) {
                if (map1.containsKey(x)) {
                    map1.put(x, map1.get(x) + 1);
                } else {
                    map1.put(x, 1);
                }
            }
        });

        list2.forEach(x -> {
            if (check(x)) {
                if (map2.containsKey(x)) {
                    map2.put(x, map2.get(x) + 1);
                } else {
                    map2.put(x, 1);
                }
            }
        });
        List<String> list = new ArrayList<>();
        map1.forEach((k, v) -> {
            if (k < 1000000 - k) {
                if (map2.containsKey(1000000 - k)) {
                    System.out.println(k + " " + (1000000 - k));
                }
            }
        });

    }
}
