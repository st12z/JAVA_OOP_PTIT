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
public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            char s[]=a.toCharArray();
            boolean check=true;
            for(int i=0;i<a.length();i++){
                if(s[i]=='0' || s[i]=='8' || s[i]=='9'){
                    s[i]='0';
                }
                else if (s[i]!='1'){
                     check=false;
                }
            }
            if(check){
                int index=0;
                while(s[index]=='0'){
                    index+=1;
                }
                for(int i=index;i<a.length();i++){
                    System.out.print(s[i]);
                }
                System.out.println("");
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
