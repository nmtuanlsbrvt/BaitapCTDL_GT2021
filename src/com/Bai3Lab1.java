package com;

import java.util.Scanner;

public class Bai3Lab1 {
    public static void main(String[] args) {
        int a,b,c;
        double delta;
        Scanner heSo = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = heSo.nextInt();
        System.out.println("Nhập b: ");
        b = heSo.nextInt();
        System.out.println("Nhập c: ");
        c = heSo.nextInt();
        delta=Math.pow(b, 2)-4*a*c;
        System.out.println("Delta: %.2f",delta);
        heSo.close();
    }
    
}
