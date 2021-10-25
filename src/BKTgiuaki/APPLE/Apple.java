package APPLE;

import java.util.Scanner;

public class Apple {
    private String iD;
	private String khoiLuong;
	String mausac;

	public Apple(String iD, String khoiLuong, String mausac) {
		super();
		this.iD = iD;
		this.khoiLuong = khoiLuong;
		this.mausac = mausac;
	}

	static Scanner sc = new Scanner(System.in);

	Apple() {
	}

	public void inThongTin() {
		System.out.println("Mã id: " + this.iD);
		System.err.println("Khối Lượng: " + this.khoiLuong);
		System.out.println("Màu sắc: " + this.mausac);
	}

	public void nhapThongTin() {
		System.out.println("Mã id: ");
		iD = sc.nextLine();
		System.err.println("Khối Lượng: ");
		khoiLuong = sc.nextLine();
		System.out.println("Màu sắc: ");
		mausac = sc.nextLine();
	}

    
}
