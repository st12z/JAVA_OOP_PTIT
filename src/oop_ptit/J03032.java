/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Scanner;

/**
 *
 * @author T
 */
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            String a[]=s.split("\\s+");
            for(int i=0;i<a.length;i++){
                a[i]=new StringBuilder(a[i]).reverse().toString();
            }
            for(String x:a){
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
}
