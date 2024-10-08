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
public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/DATA.in"));
        List<String>list= new ArrayList<>();
        while(sc.hasNext()){
            String s= sc.next();
            try{
                int x= Integer.parseInt(s);
            }catch(Exception ex){
                list.add(s);
            }
        }
        Collections.sort(list);
        for(String s:list){
            System.out.print(s+" ");
        }
    }
}
