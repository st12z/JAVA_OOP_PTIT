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
public class J01011 {
    public static int ucln(int a,int b){
        if(b==0) return a;
        return ucln(b, a%b);
    }
    public static long bcnn(int a,int b){
        return (long)a*b/ucln(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(bcnn(a, b)+" "+ucln(a, b));
        }
    }
}
