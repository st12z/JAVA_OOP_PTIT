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
public class J07029 {
    static boolean check(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) is.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        list.forEach(x -> {
            if (check(x)) {
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            }
        });
        for(int i=0;i<10;i++){
            Map.Entry<Integer,Integer> entry=map.lastEntry();
            System.out.println(entry.getKey()+" "+entry.getValue());
            map.remove(entry.getKey());
        }
    }
}
