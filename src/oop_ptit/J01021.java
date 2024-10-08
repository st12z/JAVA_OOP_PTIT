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
public class J01021 {
    public static int mod=(int)1e9+7;
    public static long luythua(int a,long b){
        if(b==0) return 1;
        long res=luythua(a, b/2);
        if(b%2==1){
            return ((res%mod)*(res%mod)%mod)*a;
        }
        else{
            return ((res%mod)*(res%mod));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a=sc.nextInt();
            long b=sc.nextLong();
            System.out.println(luythua(a, b));
            if(a==0 && b==0) System.exit(0);
        }
    }
}
