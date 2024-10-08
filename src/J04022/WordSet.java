/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04022;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author T
 */
public class WordSet {
    TreeSet<String>set;
    public WordSet() {
        set=new TreeSet<>() ;
    }
    public WordSet(String s ) {
        this();
        String a[]=s.toLowerCase().trim().split("\\s+");
        for(String x:a) this.set.add(x);
    }
    public WordSet union(WordSet another){
        WordSet res = new WordSet();
        res.set.addAll(this.set);
        res.set.addAll(another.set);
        return res;
    }
    public WordSet intersection(WordSet another){
        WordSet res = new WordSet();
        for(String x:this.set){
            if(another.set.contains(x)){
                res.set.add(x);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return String.join(" ", this.set);
    }
    
}
