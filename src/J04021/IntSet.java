/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04021;

import java.util.TreeSet;

/**
 *
 * @author T
 */
public class IntSet {
    TreeSet<Integer> set = new TreeSet<>();
    public IntSet(int a[]) {
        for(int x:a){
            set.add(x);
        }
    }
    public IntSet union(IntSet another){
        for(int x:another.set){
            this.set.add(x);
        }
        return this;
    }

    @Override
    public String toString() {
        String res="";
        for(int x:this.set){
            res+=x+" ";
        }
        return res;
    }
    
}
