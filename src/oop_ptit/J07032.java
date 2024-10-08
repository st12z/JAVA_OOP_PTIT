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
public class J07032 {
    static boolean  check(Integer n){
        String s= n.toString();
        if(s.length()%2==0 || s.length()<=1) return false;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2==0){
                return false;
            }
        }
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
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
        TreeMap<Integer, Integer> res = new TreeMap<>();

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
        map1.forEach((k,v)->{
            if(map2.containsKey(k)){
                res.put(k, v+map2.get(k));
            }
        });
        for(int i=0;i<10;i++){
            System.out.println(res.firstKey()+" "+res.get(res.firstKey()));
            res.remove(res.firstKey());
        }
        
    }
}
