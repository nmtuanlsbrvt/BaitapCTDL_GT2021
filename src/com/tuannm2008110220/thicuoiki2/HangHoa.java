package com.tuannm2008110220.thicuoiki2;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HangHoa {
    String loai;
    String mahang;
    String tenhanghoa;
    int gianhap;
    int soluongtonkho;
    String ngaynhapkho;
    Date ngay;
    Scanner sc = new Scanner(System.in);
    Scanner scs = new Scanner(System.in);
    HangHoa(){}
    public void  HangHoa(String l,String ma, String ten, int gia, int soluong, String ng){
        loai = l;
        mahang = ma;
        tenhanghoa = ten;
        gianhap = gia;
        soluongtonkho = soluong;
        ngaynhapkho = ng;
    }
    public void inThongTinHangHoa(){
        System.out.print("Loại Hàng Hoá: "+loai);
        System.out.print("  || Mã Hàng Hoá: "+mahang);
        System.out.print("  || Tên Hàng Hoá: "+tenhanghoa);
        System.out.print(" || Giá Nhập: "+gianhap);
        System.out.print(" || Số Lượng Tồn Kho: "+soluongtonkho);
        System.out.println(" || Ngày Nhập Kho: "+ngaynhapkho +" " +ngay);
    }
    public void nhapThongTinHangHoa() throws ParseException{
        System.out.println("Loại Hàng Hoá:");
        loai = sc.nextLine();
        System.out.print("Mã Hàng Hoá: ");
        mahang = sc.nextLine();
        System.out.print("Tên Hàng Hoá: ");
        tenhanghoa = sc.nextLine();
        System.out.print("Giá Nhập: ");
        gianhap = scs.nextInt();
        System.out.print("Số Lượng Tồn Kho: ");
        soluongtonkho = scs.nextInt();
        System.out.print("Ngày Nhập Kho: ");
        ngaynhapkho = sc.nextLine();
        ngay = chuyenNgaySangChuoi(ngaynhapkho);
        ngaynhapkho = chuyenNgaySangChuoi(ngay);

    }
    public static void main(String[] args) throws ParseException {
        //Khai bao bien kieu ngay
        Date ngaySinh;
        String strNgaySinh = "20/11/2000";
        
        ngaySinh = chuyenChuoiSangNgay(strNgaySinh);
        System.out.println(ngaySinh);

        String str = chuyenNgaySangChuoi(ngaySinh);

        System.out.println(str);
        
    }
    public static Date chuyenChuoiSangNgay(String chuoiNgay) throws ParseException{
        //ngày việt nam
        Date date;
        /**
         * dd: ngày
         * mm: tháng
         * yyyy: năm
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = (Date) simpleDateFormat.parse(chuoiNgay);
        return date;
    }
    public static String chuyenNgaySangChuoi(Date date){
        String chuoiNgayViet = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        chuoiNgayViet =  simpleDateFormat.format(date);
        return chuoiNgayViet;

    }
}
