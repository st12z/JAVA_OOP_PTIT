/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
class Online implements  Comparable<Online>{
    private String ten,timeBegin,timeEnd;
    private long totalTime;
    public Online(String ten, String timeBegin, String timeEnd) throws ParseException {
        this.ten = ten;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        totalTime=(f.parse(timeEnd).getTime()-f.parse(timeBegin).getTime());
    }

    @Override
    public int compareTo(Online o) {
        if(o.totalTime==this.totalTime) return this.ten.compareTo(o.ten);
        if(this.totalTime<o.totalTime) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ten+" "+totalTime/60000;
    }
    
}
public class J07084 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("src/oop_ptit/Online.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Online> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Online(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(Online x:list){
            System.out.println(x);
        }
    }
}
