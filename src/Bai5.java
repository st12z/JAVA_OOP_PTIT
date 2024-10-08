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
public class Bai5 {
    static int prime[]=new int[1000001];
    static void sang(){
        for(int i=0;i<=1000000;i++) prime[i]=1;
        prime[0]=0;prime[1]=0;
        for(int i=2;i<=Math.sqrt(1000000);i++){
            if(prime[i]==1){
                for(int j=i*i;j<=1000000;j+=i){
                    prime[j]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        List<Integer> list =(ArrayList<Integer>)os.readObject();
        TreeSet<Integer>set= new TreeSet<>();
        sang();
        for(Integer x:list){
            if(prime[x]==1 &&x>=100 ) set.add(x);
        }
        for(Integer x:set){
            System.out.println(x);
        }
    }
}
