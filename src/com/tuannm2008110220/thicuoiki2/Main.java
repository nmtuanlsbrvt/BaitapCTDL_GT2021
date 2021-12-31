package com.tuannm2008110220.thicuoiki2;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        hanghoainfo();
        do {
            System.out.println("-----------------MENU-------------------");
            System.out.println("1)  Thêm Hàng Hoá Vào Danh Sách         |");
            System.out.println("2)  Xem Danh Sách Hàng Hoá              |");
            System.out.println("3)  Tìm Kiếm Hàng Hoá Theo Mã Hàng      |");
            System.out.println("4)  Tìm kiếm Hàng Hoá Theo Loại         |");
            System.out.println("5)  Tìm kiếm Hàng Hoá Theo Ngày Nhập    |");
            System.out.println("6)  Xoá 1 Hàng Hoá Theo Mã              |");
            System.out.println("7)  Sửa Thông Tin Theo Mã               |");
            System.out.println("8)  Sắp Xếp Hàng Hoá Tăng Dần Theo Giá  |");
            System.out.println("9)  Sắp Xếp Hàng Hoá Giảm Dần Theo Giá  |");
            System.out.println("10) Thống Kê Danh Sách                  |");
            System.out.println("11) Kết Thúc Chương Trình               |");
            System.out.println("----------------------------------------");

            System.out.println("Chọn chức năng(nhập số): ");
            int key = bienNhap.nextInt();

            switch (key) {
                case 1:
                    themHangHoa();
                    break;
                case 2:
                    inThongTinHangHoa();
                    break;
                case 3:
                    timMaHang();
                    break;
                case 4:
                    timLoaiHangHoa();
                    break;
                case 5:
                    timNgayNhapKho();
                    break;
                case 6:
                    xoaHangHoa();
                    break;
                case 7:
                    sua();
                    break;
                case 8:
                    sapxepHangHoaTangDan();
                    break;
                case 9:
                    sapxepHangHoaGiamDan();
                    break;
                case 10:
                    qlhh.toTal();
                    break;
                case 11:
                    System.out.println("-----Cảm ơn đã sử dụng chương trình !-----");
                    System.exit(0);
                    break;
            }
            System.out.println("Về Menu(y/n)?: ");
        } while (bienNhaps.nextLine().equals("y"));
    }
    public static QLHH qlhh = new QLHH();

    public static Scanner bienNhap = new Scanner(System.in);
    public static Scanner bienNhaps = new Scanner(System.in);

    static void themHangHoa() throws ParseException {
        while (true) {
            qlhh.themVao();
            System.out.println("Thêm Hàng Hoá(y/n): ");
            bienNhap.nextLine();
            if (bienNhap.nextLine().equals("n")) {
                break;
            }
        }
    }
    static void inThongTinHangHoa() {
        qlhh.print();
        bienNhap.nextLine();
    }

    static void timMaHang() {
        System.out.println("Mã Hàng Cần tìm ?:");
        String mahang = bienNhaps.nextLine();
        System.out.println("Mã hàng đã tìm được:");
        qlhh.tim(mahang);
    }

    static void timLoaiHangHoa() {
        System.out.println("Loại hàng cần tìm ?: ");
        String loai = bienNhaps.nextLine();
        qlhh.timvaInNgay(loai);
    }

    static void timNgayNhapKho() {
        System.out.println("Ngày nhập hàng hoá cần tìm ?: ");
        String ngaynhapkho = bienNhaps.nextLine();
        qlhh.timvaInNgay(ngaynhapkho);
    }

    static void xoaHangHoa() {
        System.out.println("Nhập mã hàng cần xoá:");
        String mahang = bienNhaps.nextLine();
        System.out.println("Đã xoá khỏi danh sách !");
        qlhh.xoaHang(mahang);
    }

    static void sua() throws ParseException {
        System.out.println("Nhập mã hàng hoá cần sửa:");
        String mahang = bienNhaps.nextLine();
        qlhh.suaHang(mahang);
    }
    static void sapxepHangHoaTangDan(){
        qlhh.tangDan();
    }

    static void sapxepHangHoaGiamDan(){
        qlhh.giamDan();
    }

    static void hanghoainfo() {
        qlhh.add("Thuc Pham", "001", "Mì", 2000, 30, "1/1/2021");
        qlhh.add("Thuc Pham", "002", "Mì Kokomi", 3000, 20, "1/1/2021");
        qlhh.add("Thuc Pham", "003", "Mì Hảo Hảo", 3000, 40, "1/1/2021");
        qlhh.add("Thực phẩm", "004", "Mì Sợi", 5000, 60, "1/1/2021");
        qlhh.add("Thuc Pham", "005", "Mì Cay", 30000, 10, "1/1/2021");
        qlhh.add("Thuc Pham", "006", "Mì Tôm", 10000, 29, "1/1/2021");
        qlhh.add("Thuc Pham", "007", "Mì Gấu Đỏ", 2500, 40, "1/1/2021");

        qlhh.add("Sanh Su", "008", "Ly Sứ", 50000, 27, "1/1/2021");
        qlhh.add("Sanh Su", "009", "Chén Sứ", 50000, 38, "1/1/2021");
        qlhh.add("Sanh Su", "010", "Tẩu Sứ", 150000, 10, "1/1/2021");
        qlhh.add("Sanh Su", "011", "Ấm Sứ", 200000, 22, "1/1/2021");
        qlhh.add("Sanh Su", "01", "Bình Sứ", 400000, 17, "1/1/2021");
        qlhh.add("Sanh Su", "013", "Tô Sứ", 7000, 17, "1/1/2021");
        qlhh.add("Sanh Su", "014", "Muỗng Sứ", 3000, 700, "1/1/2021");

        qlhh.add("Dien May", "015", "Ti Vi", 10000000, 90, "1/1/2021");
        qlhh.add("Dien May", "016", "Tủ Lạnh", 7000000, 20, "1/1/2021");
        qlhh.add("Dien May", "017", "Máy Lạnh", 15000000, 1, "1/1/2021");
        qlhh.add("Dien May", "018", "Máy Giặt", 3000000, 7, "1/1/2021");
        qlhh.add("Dien May", "019", "Lò vi sóng", 1000000, 32, "1/1/2021");
        qlhh.add("Dien May", "020", "Bếp điện từ", 3000000, 11, "1/1/2021");
        qlhh.add("Dien May", "021", "Laptop", 20000000, 3, "1/1/2021");
    }
    
}
