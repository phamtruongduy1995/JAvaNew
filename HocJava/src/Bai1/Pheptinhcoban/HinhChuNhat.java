/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6.hinhchunhat;

import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class HinhChuNhat {
    public static void main(String[] args) {
        System.out.println("Tinh Dien Tich hinh Chu Nhat)");
        double rong, dai, chuvi, dientich;
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap Chieu Dai: ");
        dai = sc.nextDouble();
        System.out.println("Nhap Chieu Rong: ");
        rong = sc.nextDouble();
        
        chuvi = (dai + rong)*2;
        dientich = dai * rong;
        
         System.out.println("chu vi: " + chuvi);
         System.out.println("dien tich: " + dientich);
    }
}
