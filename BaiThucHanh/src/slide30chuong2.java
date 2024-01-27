/*Viet chuong trinh nhap vao 1 so nguyen n bat ky (n>0) va tinh tong cac chu so cua so do*/
import java.util.Scanner;
public class slide30chuong2{
    public static void main(String[] args) {
        int n, sodu, tong=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n : ");
        n=sc.nextInt();
        while(n>0){
        sodu=n%10;
        n=n/10;
        tong += sodu;}
        System.out.print("Tong cac chu so cua n = " +tong);}
    }
