package APPLE;

import java.util.ArrayList;
import java.util.Scanner;

public class ListApple {
    static ArrayList<Apple> dsApple = new ArrayList<>();
	static Scanner Nhap = new Scanner(System.in);

	public void nhapDanhSach() {
		while (true) {

			Apple apple = new Apple();
			apple.nhapThongTin();

			Nhap.nextLine();
			dsApple.add(apple);

			System.out.println("Nhập thêm Apple vào:(Yes/No) ?");
			if (Nhap.nextLine().equals("n"))
				break;
		}
	}

	public void xuatDanhSach() {
		for (Apple apple : dsApple) {
			apple.inThongTin();
		}
	}

	public void timTheoMau() {
		System.out.println("Màu sắc cần tìm: ");
		for (Apple apple : dsApple) {
			if (Nhap.nextLine().equals(apple.mausac))
				apple.inThongTin();
		}
	}
    
}
