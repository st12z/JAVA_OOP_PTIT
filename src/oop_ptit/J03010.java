/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author T
 */
public class J03010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s=sc.nextLine().trim().toLowerCase();
            String a[]=s.split("\\s++");
            String res=a[a.length-1];
            for(int i=0;i<a.length-1;i++){
                res=res+a[i].charAt(0);
            }
            res+="@ptit.edu.vn";
            System.out.println(res);
        }
    }
}
