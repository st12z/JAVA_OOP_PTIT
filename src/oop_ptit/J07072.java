/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
class HoTen implements  Comparable<HoTen>{
    private String ho,ten,tenDem,fullName,StringSort;

    public HoTen(String fullName) {
        fullName=fullName.trim().toLowerCase();
        String a[]=fullName.split("\\s+");
        String res="";
        this.StringSort="";
        for(int i=0;i<a.length;i++){
            a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1);
            this.ho=a[0];
            if(i!=a.length-1) StringSort+=a[i];
            else StringSort=a[i]+StringSort;
            this.tenDem=a[1];
            res+=a[i];
            if(i!=a.length-1){
                res+=" ";
            }
        }
        this.fullName = res;
        
    }

    @Override
    public int compareTo(HoTen o) {
        return this.StringSort.compareTo(o.StringSort);
    }

    @Override
    public String toString() {
        return fullName;
    }
    
}
public class J07072 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/DANHSACH.in"));
        List<HoTen> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(new HoTen(sc.nextLine()));
        }
        Collections.sort(list);
        for(HoTen x:list){
            System.out.println(x);
        }
    }
}
