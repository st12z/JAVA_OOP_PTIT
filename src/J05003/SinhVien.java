/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05003;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author T
 */
public class SinhVien implements Comparable<SinhVien>{
    private String msv,ten,lop;
    private String  namSinh;
    private float gpa;
    public SinhVien() {
    }

    public SinhVien(int cnt,String ten, String lop, String namSinh, float gpa) throws ParseException {
        this.msv=String.format("B20DCCN%03d", cnt);
        String res="";
        String a[]=ten.toLowerCase().trim().split("\\s+");
        for(String x:a){
            x=Character.toUpperCase(x.charAt(0))+x.substring(1);
            res+=x+" ";
        }
        res.trim();
        this.ten=res;
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        Date namSinh1=df.parse(namSinh);
        this.namSinh=df.format(namSinh1);
    }

    @Override
    public String toString() {
        return msv+" "+ten+" "+lop+" "+namSinh+" "+String.format("%.02f", gpa);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.gpa<o.gpa){
            return 1;
        }
        return -1;
    }
    
    
}
