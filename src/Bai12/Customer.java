/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author T
 */
public class Customer implements Comparable<Customer> {

    private String maKH, tenKH, diaChi, maSP;
    private int soluong;
    private Date timeBuy;
    private Date endAssur;
    private double totalPay;

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public void setEndAssur(String endAssur) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        
        this.endAssur = sf.parse(endAssur);
    }

    public Customer() {
    }

    public Customer(int maKH, String tenKH, String diaChi, String maSP, int soluong, Date timeBuy) {
        this.maKH = String.format("KH%02d", maKH);
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.soluong = soluong;
        this.timeBuy = timeBuy;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public Date getTimeBuy() {
        return timeBuy;
    }

    @Override
    public String toString() {
        return maKH + " " + tenKH + " " + diaChi + " " + maSP + " " + String.format("%.0f", totalPay) + " " + endAssur;
    }

    @Override
    public int compareTo(Customer o) {

        if (this.endAssur.equals(o.endAssur)) {
            return this.maKH.compareTo(o.maKH);
        }
        return this.endAssur.compareTo(o.endAssur);
    }

}
