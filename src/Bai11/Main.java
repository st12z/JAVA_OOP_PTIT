/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11;

/**
 *
 * @author T
 */
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        Scanner sc3 = new Scanner(new File("HOIDONG.in"));

        List<SinhVien> listSV = new ArrayList<>();
        List<DeTai> listDT = new ArrayList<>();
        List<HoiDong> listHD = new ArrayList<>();
        int n = Integer.parseInt(sc1.nextLine());
        for (int i = 0; i < n; i += 1) {
            listSV.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        n = Integer.parseInt(sc2.nextLine());
        for (int i = 0; i < n; i++) {
            listDT.add(new DeTai(i + 1, sc2.nextLine(), sc2.nextLine()));
        }
        n = Integer.parseInt(sc3.nextLine());
        for (int i = 0; i < n; i++) {
            String a[] = sc3.nextLine().split("\\s+");
            listHD.add(new HoiDong(a[0], a[1], a[2]));
        }
        Collections.sort(listHD, new Comparator<HoiDong>() {
            @Override
            public int compare(HoiDong o1, HoiDong o2) {
                String ten1 = "";
                String ten2 = "";
                String ma1 = "";
                String ma2 = "";
                for (SinhVien x : listSV) {
                    if (x.getMsv().equals(o1.getMsv())) {
                        ten1 = x.getTen();
                        ma1 = x.getMsv();
                        break;
                    }
                }
                for (SinhVien x : listSV) {
                    if (x.getMsv().equals(o2.getMsv())) {
                        ten2 = x.getTen();
                        ma2 = x.getMsv();
                        break;
                    }
                }

                return ma1.compareTo(ma2);

            }
        });
        TreeSet<String> set = new TreeSet<>();
        for (HoiDong hd : listHD) {
            set.add(hd.getMaHD());
        }
        int cnt = 1;
        for (String s : set) {
            System.out.println(String.format("DANH SACH HOI DONG %d:", cnt++));
            for (HoiDong hd : listHD) {
                if (hd.getMaHD().equals(s)) {
                    String maDT = hd.getMaDT();
                    String maSV = hd.getMsv();
                    SinhVien a = new SinhVien();
                    DeTai b = new DeTai();
                    for (SinhVien sv : listSV) {
                        if (sv.getMsv().equals(maSV)) {
                            a = sv;
                            break;
                        }
                    }
                    for (DeTai dt : listDT) {
                        if (dt.getMaDT().equals(maDT)) {
                            b = dt;
                            break;
                        }
                    }
                    System.out.println(a + " " + b);
                }
            }
        }
    }
}
