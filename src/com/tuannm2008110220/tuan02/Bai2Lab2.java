package com.tuannm2008110220.tuan02;

import java.util.Scanner;

public class Bai2Lab2 {
    public static void main(String[] args) {
        int a,b,c;
        double delta;
        Scanner heSo = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a= heSo.nextInt();
        System.out.println("Nhập b: ");
        b=heSo.nextInt();
        System.out.println("Nhập c; ");
        c=heSo.nextInt();
        if (a==0) {
            if(b==0) {
                if(c==0)
                System.out.println("PT vô số nghiệm");
                else 
                    System.out.println("Pt vô nghiệm");
            } else {
                delta=Math.pow(b, 2)-4*a*c;
                if(delta>0){
                    System.out.println("PT có 2 nghiệm phân biệt: ");
                    x1=(double)((-b+Math.sqrt(delta))/2*a);
                    System.out.println("x1=%2.f",x1);
                    x2=(double)((-b-Math.sqrt(delta))/2*a);
                    System.out.println("x2=%2.f",x2);
                } else {
                    if(delta<0){
                        System.out.println("PT vô nghiệm");
                        else {
                            x1=x2=(double)-b/2*a;
                            System.out.println("PT có nghiệm kép x1 = x2 = %2.f",x1);

                        }
                    }
                }
                heSo.close();

                }
            }
            }
        }
        
    }
    
}
