/*Viet chuong trinh nhap vao cac so nguyen va tinh tong cac so do, neu tong > 100 thi ket thuc vong lap 
va hien thi thong bao tong cua cac so da nhap*/
import java.util.Scanner;
public class slide47chuong2{
    public static void main(String[] args) {
      int tong=0,number;
      Scanner sc = new Scanner(System.in);
      do{
        System.out.print("Nhap vao so nguyen bat ky : ");
        number = sc.nextInt();
        tong += number;
      }  while ( tong < 100);
      System.out.print("Tong cac so nguyen vua nhap = "+tong);
    }
}
