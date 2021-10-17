package com.tuannm2008110220.tuan02;

import java.util.Scanner;

public class Bai1Lab2 {
    public static void main(String[] args) {
        int a, b;
        double x;
        Scanner bien = new Scanner(System.in);
        System.out.print("Nhập a = ");
        a = bien.nextInt();
        System.out.print("Nhập b = ");
        b = bien.nextInt();
        if(a == 0){
            if(b == 0)
                System.out.print("Phương trình vô số nghiệm");
            else 
                System.out.print("Phương trình vô nghiệm");
        } 
        else{
            x = (double)-b/a;
            System.out.printf("Nghiệm của phương trình %dx + %d = 0 là %.2f", a, b, x);
        }
        bien.close();    
    }
    
}

