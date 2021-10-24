package com.tuannm2008110220.tuan03.Baitapthem;

import java.util.zip.DataFormatException;
public class Nhanvien {

    String tenNV;
    int luong;
    String diachi;
    String bophanlamviec;
    String ngaysinh;

    void inThongTin(){
        System.out.println("Tên NV: " +tenNV);
        System.out.println("Lương: " +luong);
        System.out.println("Địa Chỉ: " +diachi);
        System.out.println("Bộ Phận Làm Việc: " +bophanlamviec);
        System.out.println("Ngày Sinh: " +ngaysinh);
    }

    Nhanvien(){

    }

    Nhanvien(String name, String id){
        tenNV = name;
        diachi = id;
    }
}