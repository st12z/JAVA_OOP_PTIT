/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author T
 */
public class bai1 {

    static boolean check(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream is1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        
        List<String> list1 = (ArrayList<String>) is1.readObject();
        TreeMap<String,Integer> map=new TreeMap<String, Integer>();
        for(String x:list1){
            String a[] = x.split("[\\s,.;!?()\\-:/\n\t]+");
            for(String y:a){
                y=y.toLowerCase();
                if(map.containsKey(y)){
                    map.put(y,map.get(y)+1);
                }
                else{
                    map.put(y, 1);
                }
            }
        }
        List<Map.Entry<String,Integer>>listMap=new ArrayList<>(map.entrySet());
        Collections.sort(listMap,new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o2.getValue()!=o1.getValue()){
                    return o2.getValue()-o1.getValue();
                }
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for(Map.Entry<String,Integer> entry:listMap){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
