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
public class J02014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int f[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            f[0]=a[0];
            for(int i=1;i<n;i++){
                f[i]=f[i-1]+a[i];
            }
            int pos=-2;
            for(int i=1;i<n;i++){
                if(f[i-1]==f[n-1]-f[i]){
                    pos=i;
                    break;
                }
            }
            System.out.println(pos+1);
            
        }
    }
}
