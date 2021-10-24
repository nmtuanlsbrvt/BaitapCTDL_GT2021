package com.tuannm2008110220.tuan06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QLMT {
    static ArrayList<MayTinh> dsmaytinh = new ArrayList<MayTinh>();
   static Scanner bienNhap = new Scanner(System.in);

   public static void nhapthongtinMT() {
      while (true) {

         MayTinh maytinh;
         maytinh = new MayTinh();

         maytinh.nhapThongTinMT();
         bienNhap.nextLine();
         dsmaytinh.add(maytinh);

         System.out.println("Thêm máy tính(y/n) ");
         if (bienNhap.nextLine().equals("n")) {
            break;
         }
      }
   }

   public static void xuatthongtinMT() {
      for (MayTinh maytinh : dsmaytinh) {
         maytinh.inThongTinMayTinh();
      }
   }

   public static void tronThongTin(){
      Collections.shuffle(dsmaytinh);
   }

   public static void sapxepthongtinMT(){

      Comparator<MayTinh> comp;
      comp = new Comparator<MayTinh>() {
         
         public int compare(MayTinh o1, MayTinh o2){
            return Double.compare(o1.soRam, o2.soRam);
         }
      };
      Collections.sort(dsmaytinh, comp);
   }

   public static void timtenMt(){
      System.out.println("Tên cần tìm: ");
      for(MayTinh maytinh : dsmaytinh){
         if(bienNhap.nextLine().equals(maytinh.tenMayTinh)){
            maytinh.inThongTinMayTinh();
         }
      }
   }
    
}
