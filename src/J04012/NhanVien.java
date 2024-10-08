/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04012;

/**
 *
 * @author T
 */
public class NhanVien {
    private String ma,ten;
    private int luongCB,ngayCong;
    private String chucVu ;
    private int phuCap;
    private double thuong;
    private int thuNhap;
    private int luongThang;
    private static int cnt=1;
    public NhanVien(String ten, int luong, int ngayCong, String chucVu) {
        this.ma=String.format("NV%02d", cnt++);
        this.ten = ten;
        this.luongCB = luong;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
        if(this.chucVu.equals("GD")) this.phuCap=250000;
        else if(this.chucVu.equals("PGD")) this.phuCap=200000;
        else if(this.chucVu.equals("TP")) this.phuCap=180000;
        else{
            this.phuCap=150000;
        }
        this.luongThang=luong*ngayCong;
        if(this.ngayCong>=25) this.thuong=0.2*this.luongThang;
        else if(this.ngayCong>=22 && this.ngayCong<25){
            this.thuong=0.1*luongThang;
        }
        else{
            this.thuong=0;
        }
        this.thuNhap=(int)this.thuong+this.phuCap+this.luongThang;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+luongThang+" "+(int)thuong+" "+phuCap+" "+thuNhap;
    }
    
}
