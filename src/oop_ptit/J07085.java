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
import java.util.ArrayList;

/**
 *
 * @author T
 */
public class J07085 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList < String >)sc.readObject();
        for(String s:list){
            String res="";
            String a[]=s.split("[a-zA-Z]+");
            for(String i:a) res+=i;
            res=res.replaceFirst("^0*", "");
            if(res.isEmpty()) res="0";
            int sum=0;
            for(int j=0;j<res.length();j++){
                sum+=res.charAt(j)-'0';
            }
            System.out.println(res+" "+sum);
        }
    }
}
