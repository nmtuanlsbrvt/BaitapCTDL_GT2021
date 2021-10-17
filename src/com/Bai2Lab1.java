package com;

import java.util.Scanner;

public class Bai2Lab1 {
    public static void main(String[] args) {
        int dai, rong, CV, DT;
        Scanner canh = new Scanner(System.in);
        System.out.println("Nhập chiều dài của HCN: ");
        dai = canh.nextInt();
        System.out.println("Nhập chiều rộng của HCN: ");
        rong = canh.nextInt();
        CV = (dai + rong)*2;
        DT = dai*rong;
        System.out.println("Chu vi của HCN: %d \n",CV);
        System.out.println("Diện tích của HCN: %d \n",DT);
        System.out.println("Cạnh nhỏ của HCN: %d",Math.min(dai, rong));
        canh.close();
    }
    
}
