package com.tuannm2008110220.tuan06;

import java.util.Scanner;

public class QLMTTestDrive {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         QuanLyMayTinh qlMT = new QuanLyMayTinh();
        Scanner bienNhap = new Scanner(System.in);

        do {
            System.out.println("---------------MENU----------------");
            System.out.println("1)  Nhập Danh Sách MT              |");
            System.out.println("2)  Xuất Danh Sách MT              |");
            System.out.println("3)  Sắp Xếp                        |");
            System.out.println("4)  Xuất Danh Sách MT Ngẫu Nhiên   |");
            System.out.println("5)  Tìm theo tên                   |");
            System.out.println("6)  Kết Thúc.                      |");
            System.out.println("-----------------------------------");

            System.out.println("Chọn chức năng (chọn số): ");
            int key = bienNhap.nextInt();

            switch (key) {
            case 1:
                qlMT.nhapthongtinMT();
                break;
            case 2:
                qlMT.xuatthongtinMT();
                break;
            case 3:
                qlMT.sapxepthongtinMT();
                qlMT.xuatthongtinMT();
                break;
            case 4:
                qlMT.tronThongTin();
                break;
            case 5:
                qlMT.timtenMt();
                break;
            case 6:
                System.out.println("Kết Thúc!");
                System.exit(0);
                break;
            }

            System.out.println("Quay về MENU (y/n)?: "); // tạo nút quay về mỗi lần sài 1 chức năng !
            bienNhap.nextLine();

        } while (bienNhap.nextLine().equals("y"));
    }
}
