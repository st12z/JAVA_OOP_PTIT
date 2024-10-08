/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai12;

/**
 *
 * @author T
 */
public class Product {
    private String maSP,tenSP;
    private double giaSP;
    private int assur;

    public Product() {
    }
    
    public Product(String maSP, String tenSP, double giaSP, int assur) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.assur = assur;
    }

    public String getMaSP() {
        return maSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public int getAssur() {
        return assur;
    }

    @Override
    public String toString() {
        return "Product{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", giaSP=" + giaSP + ", assur=" + assur + '}';
    }
     
}
