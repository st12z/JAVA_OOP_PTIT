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
public class J01017 {
    public static boolean check(String s){
        for(int i=0;i<s.length()-1;i++){
            int a=s.charAt(i)-'0';
            int b=s.charAt(i+1)-'0';
            if(Math.abs(a-b)!=1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
