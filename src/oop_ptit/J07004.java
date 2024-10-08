/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author T
 */
public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/oop_ptit/DATA.in");
        Scanner sc = new Scanner(f);
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while(sc.hasNext()){
            int x =sc.nextInt();
            if(map.containsKey(x)){
                int fre =map.get(x);
                fre++;
                map.put(x, fre);
            }
            else{
                map.put(x, 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
