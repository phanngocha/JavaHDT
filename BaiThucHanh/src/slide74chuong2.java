/*Viet chuong trinh tinh tong cac so chan cua mang */
import java.util.Scanner;
public class slide74chuong2
{
  public static void main(String[] args)
   {
     int n;
     Scanner sc = new Scanner(System.in);
     do{
        System.out.print("Nhap vao so phan tu cua mang : ");
        n = sc.nextInt();
       }while (n < 0);
       int A[] = new int[n];
       System.out.println("Nhap cac phan tu cho mang: ");
       for (int i = 0; i < n; i++)
         {
          System.out.print("Nhap phan tu thu "+i +": ");
          A[i] = sc.nextInt();
         }
         int tong = 0;
       for (int i=0; i<n;i++)
         {
          if (A[i] % 2 == 0)
           {tong += A[i];}
         }
    System.out.println("Tong cac so chan cua mang = "+ tong);
   }
}