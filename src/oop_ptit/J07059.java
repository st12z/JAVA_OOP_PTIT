/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
class CaThi implements Comparable<CaThi>{
    private String ma;
    private String ID;
    private String ngayThi;
    private String gioThi;
    private long totalTime;
    private static int cnt=1;

    public CaThi(String ngayThi, String gioThi,String ID) {
        this.ma = String.format("C%03d", cnt++);
        this.ID = ID;
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        SimpleDateFormat f= new SimpleDateFormat("dd/MM/yyyy hh:mm");
        try{
            this.totalTime = f.parse(ngayThi+" "+gioThi).getTime();
        }catch(Exception e){
            
        }
    }
    
    @Override
    public int compareTo(CaThi o) {
        if(this.totalTime==o.totalTime){
            return this.ma.compareTo(o.ma);
        }
        if(this.totalTime<o.totalTime){
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return ma+" "+ngayThi+" "+gioThi+" "+ID;
    }
    
}
public class J07059 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/CATHI.in"));
        int n= Integer.parseInt(sc.nextLine());
        List<CaThi> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new CaThi(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for(CaThi x:list){
            System.out.println(x);
        }
    }
}
