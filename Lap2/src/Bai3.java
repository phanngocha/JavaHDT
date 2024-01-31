/*Viet chuong trinh nhap vao ten va mot so tuong ung la nam. Sau do xuat ra nhom tuoi cua nguoi do nhu sau:
- Neu tuoi nguoi do <16 thi hien thong bao "Ban[Ten] o do tuoi vi thanh nien".
- Neu tuoi nguoi do >=16 va nho hon 18 thi hien thong bao "Ban[Ten] o do tuoi truong thanh".
- Neu tuoi nguoi do >=18 thi hien thong bao "Ban[Ten] da gia".*/
import java.util.Scanner;
public class Bai3{
    public static void main(String[] args) {
        String ten;
        int nam;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten : ");
        ten = sc.nextLine();
        System.out.print("Nhap nam : ");
        nam = sc.nextInt();
        if((2024-nam)<16){
            System.out.println("Ban"+ten+" o do tuoi vi thanh nien.");}
           else if((2024-nam)<18){
            System.out.println("Ban "+ten+" o do tuoi truong thanh.");
           } else {
            System.out.println("Ban "+ten+" da gia.");
            }
        }
    }