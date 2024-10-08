/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author T
 */
public class J07005 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        DataInputStream is = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<100000;i++){
            int x=is.readInt();
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x, 1);
            }
        }
        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }

  
}
