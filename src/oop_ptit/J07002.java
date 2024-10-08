/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J07002 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader f = new FileReader("src/oop_ptit/DATA.in");
        Scanner sc = new Scanner(f);
        long tong=0;
        while(sc.hasNext()){
            String s=sc.next();
            try{
                int x =Integer.parseInt(s);
                tong+=x;
            }
            catch(Exception e){
                
            }
        }
        System.out.println(tong);
    }
}
