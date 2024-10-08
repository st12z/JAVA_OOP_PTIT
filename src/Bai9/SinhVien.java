/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

/**
 *
 * @author T
 */
public class SinhVien implements Comparable<SinhVien>{
    private String ten;
    private int correctAns,amountSumbit;

    public SinhVien() {
    }
    
    public SinhVien(String ten, int correctAns, int amountSumbit) {
        this.ten = ten;
        this.correctAns = correctAns;
        this.amountSumbit = amountSumbit;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.correctAns!=o.correctAns){
            return -this.correctAns+o.correctAns;
        }
        if(this.amountSumbit!=o.amountSumbit){
            return this.amountSumbit-o.amountSumbit;
        }
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return ten+" "+correctAns+" "+amountSumbit;
    }
    
    
}
