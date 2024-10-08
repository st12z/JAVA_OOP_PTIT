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
public class Bai3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list =(ArrayList<String>)os.readObject();
    
        for(String s:list){
            String binaryW="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0' || s.charAt(i)=='1') binaryW+=s.charAt(i);
            }
            try {
                System.out.println(binaryW+" "+Long.parseLong(binaryW,10));
            } catch (Exception e) {
            }
        }
    }
}
