/*Viet chuong trinh nhap vao 1 so nguyen duong bat ky tu ban phim.
 Sau do tinh va in ra giai thua cua so do.*/
 import java.util.Scanner;
 public class Bai6{
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n, giaithua=1;
      System.out.print("Nhap n = ");
      n = sc.nextInt();
      for(int i=1;i<=n;i++)
      {
          giaithua *= i;
      }
      System.out.print("n! = "+n+"! = "+giaithua);
  }
 } 