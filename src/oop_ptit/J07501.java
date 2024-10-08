/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
class Customers implements Comparable<Customers>{
    private String ma, ten,soPhong;
    private Date ngayDen,ngayDi;
    private int moneyService;
    private long soNgay;
    private static int cnt=1;
    private long total;
    public Customers(String ten, String soPhong, Date ngayDen, Date ngayDi, int moneyService) {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = "";
        String a[]=ten.trim().toLowerCase().split("\\s+");
        for(int i=0;i<a.length;i++){
            a[i]=Character.toUpperCase(a[i].charAt(0))+a[i].substring(1);
            this.ten+=a[i]+" ";
        }
        this.ten=this.ten.trim();
        this.soPhong = soPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.moneyService = moneyService;
        this.soNgay = (ngayDi.getTime()-ngayDen.getTime())/(1000l*60*60*24)+1;
        if(soPhong.charAt(0)=='1'){
            total = 25*soNgay+moneyService;
        }
        else if(soPhong.charAt(0)=='2'){
            total = 34*soNgay+moneyService;
        }
        else if(soPhong.charAt(0)=='3'){
            total = 50*soNgay+moneyService;
        }
        else{
            total = 80*soNgay+moneyService;
        }
    }

    @Override
    public String toString() {
    
        return ma+" "+ten+" "+soPhong+" "+soNgay+" "+total;
    }

    @Override
    public int compareTo(Customers o) {
        return (int)(-this.total+o.total);
    }
    
    
}
public class J07501 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("src/oop_ptit/KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Customers>list = new ArrayList<>();
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        for(int i=0;i<n;i++){
            list.add(new Customers(sc.nextLine(), sc.nextLine(), date.parse(sc.nextLine()), date.parse(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(Customers x:list){
            System.out.println(x);
        }
    }
}
