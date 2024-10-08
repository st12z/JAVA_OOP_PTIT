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
public class J07006 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list =(ArrayList<Integer>) is.readObject();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        list.forEach(x->{
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }
            else{
                map.put(x, 1);
            }
        });
        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
}
