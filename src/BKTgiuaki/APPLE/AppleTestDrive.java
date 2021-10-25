package APPLE;

import java.util.Scanner;

public class AppleTestDrive {
    public static void main(String[] args) {
		Kho_Apple Ap = new Kho_Apple();
		Scanner nhap = new Scanner(System.in);
		
		
		Apple Ap1 = new Apple("001", "1kg", "Vàng");
		Apple Ap2 = new Apple("002", "2kg", "Đỏ");
		Apple Ap3 = new Apple("003", "3kg", "Xanh");

		do {
			System.out.println("____________MENU____________");
			System.out.println("1)  Nhập Danh Sách Apple: ");
			System.out.println("2)  Xuất Danh Sách Apple: ");
			System.out.println("3)  Tìm Theo Màu Sắc: ");
			System.out.println("4) In Danh Sách Apple: ");
			System.out.println("5)  Kết Thúc");

			
			System.out.println("Vui lòng chọn chức năng: ");
			int key = nhap.nextInt();

			switch (key) {
			case 1:
				Ap.nhapVaoDanhSach();
				break;
			case 2:
				Ap.xuatDanhSach();
				break;
			case 3:
				Ap.timTheoMau();
				break;
			case 4:
				System.out.println("_______APPLE 1_______");
				Ap1.inThongTin();
				System.out.println("_______APPLe 2_______");
				Ap2.inThongTin();
				System.out.println("_______APPLE 3_______");
				Ap3.inThongTin();
				break;
				
			case 5:
				System.out.println("Kết Thúc!");
				System.exit(0);
				break;
			}

			System.out.println("Quay về MENU (Yes/No)?:     ");
			Nhap.nextLine();

		} while (Nhap.nextLine().equals("Yes"));
	}
    
}
