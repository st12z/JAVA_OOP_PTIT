/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author T
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        List<Product>listSP=new ArrayList<>();
        List<Customer>listKH=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            listSP.add(new Product(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        SimpleDateFormat sf= new SimpleDateFormat("dd/MM/yyyy");
        n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            listKH.add(new Customer(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sf.parse(sc.nextLine())));
        }
        ArrayList<String>res= new ArrayList<>();
        for(Customer c:listKH){
            Product sp = new Product();
            for(Product p:listSP){
                if(p.getMaSP().equals(c.getMaSP())){
                    sp=p;
                    break;
                }
            }
         
            Calendar calendar=Calendar.getInstance();
            calendar.setTime(c.getTimeBuy());
            calendar.add(Calendar.MONTH, sp.getAssur());
            String dateEnd=sf.format(calendar.getTime());
            c.setTotalPay(c.getSoluong()*sp.getGiaSP());
            c.setEndAssur(dateEnd);
        }
        Collections.sort(listKH);
        for(Customer c:listKH){
            System.out.println(c);
        }
    }
}
