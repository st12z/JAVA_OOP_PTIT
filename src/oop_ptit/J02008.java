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
public class J02008 {
    public static int ucln(int a,int b){
        if(b==0) return a;
        return ucln(b, a%b);
    }
    public static int bcnn(int a,int b){
        return a*b/ucln(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=1;
            for(int i=1;i<=n;i++){
                a=bcnn(a, i);
            }
            System.out.println(a);
        }
    }
}
