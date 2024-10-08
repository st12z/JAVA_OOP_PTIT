/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04020;

/**
 *
 * @author T
 * @param <T>
 */
public class Pair<T,S> {
    private Integer key;
    private Integer value;

    public Pair(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }
    public boolean prime(Integer x){
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0) return false;
        }
        return x>1;
    }
    public boolean  isPrime(){
        return prime(key) && prime(value);
    }

    @Override
    public String toString() {
        return key+" "+value;
    }
    
}
