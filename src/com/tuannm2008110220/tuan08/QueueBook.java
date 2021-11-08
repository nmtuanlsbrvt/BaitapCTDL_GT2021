package com.tuannm2008110220.tuan08;

import java.util.Scanner;

public class QueueBook {
    QueueBook tail;
    QueueBook head;
    int namSx;
    double gia;
    String nhaSanxuat,loai;
    Scanner nhap=new Scanner(System.in);
    public QueueBook(){

    }
    public void inThongtin(){
        System.out.println("Nhà sản xuất"+ nhaSanxuat);
        System.out.println("Năm sản xuất"+ namSx);
        System.out.println("Loại"+loai);
        System.out.println("Giá"+gia);
        System.out.println("________________________");
    }
    public void nhapThongtin(){
        System.out.println("Nhà sản xuất: ");
        nhaSanxuat=nhap.nextLine();
        System.out.println("Năm sản xuất: ");
        namSx=nhap.nextInt();
        System.out.println("Loại: ");
        loai=nhap.nextLine();
        nhap.nextLine();
        System.out.println("Giá: ");
        gia=nhap.nextDouble();
        nhap.nextLine();
        System.out.println("_________________________");

    }

    public void xuat(){
        QueueNode current = head;
        if(head == null){
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("_____________DANH SÁCH____________");
        while (current != null){
            System.out.println("Nhà sản xuất"+ current.nhaSanxuat);
            System.out.println("Năm sản xuất"+ current.namSx);
            System.out.println("Loại"+current.loai);
            System.out.println("Giá"+current.gia);
            System.out.println("____________________________________");
            current=current.next;
        }

    }

    public void QueueThem(){
        nhapThongtin();
        QueueNode newNode = new QueueNode(nhaSanxuat, namSx,loai,gia);
        if(head==null){
            tail=newNode;
            head=newNode;
            return;
        }
        tail.next = newNode;
        tail = new Node;
    }

    public void QueueDau(){
        if(head==null){
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("Phần tử đầu danh sách là: ");
        inThongtin();
    }

    public void QueueXoa(){
        if(head==null){
            System.out.println("Danh sách rỗng");
            return;
        }
        head = head.next;
        System.out.println("Xóa thành công");
    }
}
