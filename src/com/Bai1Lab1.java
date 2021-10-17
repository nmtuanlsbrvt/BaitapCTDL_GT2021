package com;

import java.util.Scanner;

public class Bai1Lab1 {
    public static void main(String[] args) {
        String hovaTen;
        Double diemTB;
        Scanner thongTin = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        hovaTen = thongTin.nextLine();
        System.out.println("Điểm trung bình: ");
        diemTB = thongTin.nextDouble();
        System.out.println("%s:%.2f điểm", hovaTen, diemTB);
        thongTin.close();
    }
    
}
