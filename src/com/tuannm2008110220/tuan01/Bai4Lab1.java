package com;

import java.util.Scanner;

import jdk.javadoc.internal.tool.Main;

public class Bai4Lab1 {
    public static void main(String[] args) {
        int canh, theTich;
        Scanner heSo= new Scanner(System.in);
        System.out.println("Nhập cạnh: ");
        canh = heSo.nextInt();
        theTich=canh*canh*canh;
        System.out.println("Thể tích của khối lập phương là: %d",theTich);
        heSo.close();
    }
    
}
