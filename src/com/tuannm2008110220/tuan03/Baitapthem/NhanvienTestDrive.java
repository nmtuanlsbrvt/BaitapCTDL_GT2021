package com.tuannm2008110220.tuan03.Baitapthem;

import java.util.jar.Attributes.Name;

public class NhanvienTestDrive {
    public static void main(String[] args) {
        
        Nhanvien nhanvien;
        nhanvien = new Nhanvien();

        nhanvien.tenNV = "Nguyễn Văn B";
        nhanvien.luong = 10000000;
        nhanvien.diachi = "12 Lý Thường Kiệt, Quận 11, Tp HCM";
        nhanvien.bophanlamviec = "IT";
        nhanvien.ngaysinh = "21/12/2002";

        nhanvien.inThongTin();

        nhanvien = new Nhanvien("Lâm Vũ Thành ", " 1 ,Lý Thường Kiệt, Quận 11, Tp HCm");
        System.out.println("\nHọ và tên SV: "+nhanvien.tenNV+"\nĐịa chỉ: "+nhanvien.diachi);
    }
}
