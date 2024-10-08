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
public class J01006 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long f[]=new long[93];
            f[1]=1;f[2]=1;
            for(int i=2;i<=92;i++){
                f[i]=f[i-1]+f[i-2];
            }
            System.out.println(f[n]);
            
        }
        System.exit(0);
    } 
}
