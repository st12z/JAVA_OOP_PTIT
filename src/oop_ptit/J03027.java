/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author T
 */
public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        Stack<Character> st =new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(st.size()==0){
                st.push(s.charAt(i));
            }
            else{
                Character c = st.peek();
                if(c==s.charAt(i)){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        if(st.empty()==true){
            System.out.println("Empty String");
        }
        else{
            Collections.reverse(st);
            while(st.empty()==false){
                System.out.print(st.pop());
            }
            
        }
    }
}
