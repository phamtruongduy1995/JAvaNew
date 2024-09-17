/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1.Pheptinhcoban;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class Bai_Pheptinhcoban {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh co ban");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = sc.nextInt();
        System.out.println("Nhap so b: ");
        int b = sc.nextInt();
        int hieu = a - b;
        System.out.println(a + "-" + b + "=" + hieu);
    }
    public static int tinhtong(int a, int b)
    {
        return a+b;
    }
     public static int tinhhieu(int a, int b)
    {
        return a-b;
    }
      public static int tinhtich(int a, int b)
    {
        return a*b;
    }
       public static double tinhthuong(int a, int b)
    {
        return a/b;
    }
}
