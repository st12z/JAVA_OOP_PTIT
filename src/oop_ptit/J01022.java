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
public class J01022 {
    public static long f[]= new long[93];
    public static void solve(){
        f[1]=1;
        f[2]=1;
        for(int i=3;i<93;i++){
            f[i]=f[i-1]+f[i-2];
        }
    }
    public static char findPos(int n,long k){
        if(n==1) return '0';
        if(n==2) return '1';
        if(k>=f[n-2]){
            return findPos(n-1, k-f[n-2]);
        }
        return findPos(n-2, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        solve();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextInt();
            System.out.println(findPos(n, k));
        }
        
    }
}
