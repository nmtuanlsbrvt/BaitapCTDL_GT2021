package com.tuannm2008110220.tuan06;

import java.util.Scanner;

public class Mt {
    String tenMayTinh;
    String cpu;
    String vga;
    int soRam;

   MayTinh(){}
   Scanner sc = new Scanner(System.in);

   public void MayTinh(String name, String c, String v, int ram){

       tenMayTinh = name;
       cpu = c;
       vga = v;
       soRam = ram;
   }

   public void inThongTinMayTinh(){

       System.out.println("================================");
       System.out.println("Tên hãng máy tính: "+tenMayTinh);
       System.out.println("Loại CPU: "+cpu);
       System.out.println("Loại VGA: "+vga);
       System.out.println("Số lượng RAM: "+soRam);

   }

   public void nhapThongTinMT(){
       System.out.println("Tên máy Tính: ");
       tenMayTinh = sc.nextLine();
       System.out.println("loại CPU: ");
       cpu = sc.nextLine();
       System.out.println("Loại VGA: ");
       vga = sc.nextLine();
       System.out.println("Số Ram: ");
       soRam = sc.nextInt();
   }
    
}
