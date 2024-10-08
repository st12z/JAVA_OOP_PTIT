
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T
 */
import java.util.*;
import java.io.*;
public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            List<Character> list = new ArrayList<>();
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)=='(' ||s.charAt(i)==')'||s.charAt(i)=='[' ||s.charAt(i)==']')){
                    list.add(s.charAt(i));
                }
            }

            Stack<Character> st = new Stack<>();
            int check=1;
            for(int i=0;i<list.size();i++){
                if(st.isEmpty()){
                    st.push(list.get(i));
                }
                else{
                    char c=st.peek();
                    if((list.get(i)==')' && c=='(')||(list.get(i)==']' && c=='[')){
                        st.pop();
                    }
                    else{
                        st.push(list.get(i));
                    }
                }
            }
            if(st.isEmpty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
