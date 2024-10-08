/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author T
 */
public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        
        File f = new File("src/oop_ptit/VANBAN.in");
        Scanner sc = new Scanner(f);
        String line="";
        Set<String> set = new TreeSet<>();
        while(sc.hasNextLine()){
            String a[]=sc.nextLine().split("\\s++");
            for(String x:a){
                set.add(x.toLowerCase());
            }
        }
        for(String x:set){
            System.out.println(x);
        }
    }
}
