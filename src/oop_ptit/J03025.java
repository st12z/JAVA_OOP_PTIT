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
public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int l=0;
            int r=s.length()-1;
            int cnt=0;
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    cnt++;
                }
                l++;
                r--;
            }
            if((cnt==0 && s.length()%2==0)|| cnt>1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            
        }
    }
}
