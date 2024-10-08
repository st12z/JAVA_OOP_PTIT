/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author T
 */
public class J08020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Stack<Character> st = new Stack();
            for (int i = 0; i < s.length(); i++) {
                if (st.isEmpty()) {
                    st.push(s.charAt(i));
                } else {
                    Character c = st.peek();
                    Character x = s.charAt(i);
                    if ((c == '(' && x == ')') || (c == '[' && x == ']') || (c == '{' && x == '}')) {
                        st.pop();
                    } else {
                        st.push(x);
                    }

                }
            }
            if (st.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
