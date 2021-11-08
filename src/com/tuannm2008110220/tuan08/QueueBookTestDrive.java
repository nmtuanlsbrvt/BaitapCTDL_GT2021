package com.tuannm2008110220.tuan08;

import java.util.Scanner;

public class QueueBookTestDrive {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        int chon;
        QueueBook queueBook= new QueueBook;
        do{
            System.out.println(____________MENU____________);
            System.out.println("1. Thêm cuối");
            System.out.println("2. Xem đầu");
            System.out.println("3. Xóa đầu");
            System.out.println("4. Xuất danh sách");
            System.out.println("5. Kết thúc");
            System.out.println("Nhập lựa chọn của bạn: ");
            chon=n.nextInt();
            switch(chon){
                case 1: queueBook.QueueThem();
                break;
                case 2: queueBook.QueueDau();
                break;
                case 3: queueBook.QueueXoa();
                break;
                case 4: queueBook.xuat();
                break;
                case 5: 
                System.out.println("Kết thúc chương trình");
                return;
                default: 
                System.out.println("Lựa chọn sai");
            }
            System.out.println("Quay lại MENU (1:Yes/0:No): ");
            chon=n.nextInt();
        }
        while (chon == 1);
        n.close();
    }
    
}
