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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Bai7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        String regex="\\b(?=[^.,!?:]*\\d)[^\\s.,!?:]+\\b";
        Pattern pattern=Pattern.compile(regex);
        Set<String>set = new TreeSet<>();
        while(sc.hasNext()){
            Matcher matcher= pattern.matcher(sc.nextLine());
            while(matcher.find()){
                set.add(matcher.group());
            }
      
        }
        for(String s:set){
            for(int i=0;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                    System.out.println(s);
                    break;
                }
            }
        }
    }
}
