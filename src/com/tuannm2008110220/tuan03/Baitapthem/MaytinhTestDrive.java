package com.tuannm2008110220.tuan03.Baitapthem;

public class MaytinhTestDrive {
    public static void main(String[] args) {

        Maytinh maytinh;
        maytinh = new Maytinh();
        
        maytinh.nhasanxuat = "Microsorft";
        maytinh.namsanxuat = "2020";
        maytinh.hedieuhanh = "Window 11";
        maytinh.ram = "32GB";
        maytinh.cpu = "Intel core i3 Core Lake";
        maytinh.gia = 40000000;
        maytinh.nambaohanh = "2 năm";

        maytinh.inThongTin();

        maytinh = new Maytinh("IBM", "1969", "window 11", "2 năm");
        System.out.println("\nNhà xản xuất: " + maytinh.nhasanxuat +" \nNăm sản xuất: "+maytinh.namsanxuat+" \nHệ Điều Hành: " +maytinh.hedieuhanh+"\nNăm bảo hành: "+maytinh.nambaohanh);

    }
}