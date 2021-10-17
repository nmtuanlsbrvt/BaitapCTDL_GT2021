package com.tuannm2008110220.tuan05

import java.util.Scanner;

public class SVGD {
    public static final String remove = null;
    String hoVaTen;
    Double diemTB;
    Scanner n = new Scanner(System.in);
    
    SVGD(){

    }
    void inThongTin(){
        System.out.println("Họ và tên: " +hoVaTen);
        System.out.println("Điểm trung bình: " +diemTB);
        System.out.println("___________________________________");
    }
    void nhapThongTin(){
            System.out.print("Nhập họ và tên: ");
            hoVaTen = n.nextLine();
            System.out.print("Nhập điểm trung bình: ");
            diemTB = n.nextDouble();
            System.out.println("___________________________________");
    }
    
}
