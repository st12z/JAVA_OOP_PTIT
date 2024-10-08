/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        File f= new File("src/oop_ptit/DATA.in");
        Scanner sc = new Scanner(f);
        while(true){
            String s = sc.nextLine().trim().toLowerCase();
            if(s.equals("end")) break;
            String a[]=s.split("\\s+");
            for(int i=0;i<a.length;i++){
                a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1);
            }
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println("");
        }
    }
}
