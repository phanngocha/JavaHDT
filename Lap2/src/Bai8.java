/*Viet chuong trinh nhap vao mot day so gom n so nguyen tu ban phim.
 Tinh va in ra man hinh trung binh cong cua n so nguyen da nhap. */
 import java.util.Scanner;
 public class Bai8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double sum = 0;
        do{
        System.out.print("Nhap so phan tu cua day: n = ");
        n = scanner.nextInt();
        }while(n<0);
        double A[] = new double[n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for(int i=0; i<n; i++){
          System.out.print("Nhap phan tu thu "+i +": ");
          A[i] = scanner.nextDouble();
        }   
        for(int i=0; i<n; i++){
           sum += A[i];
        }
        double trungbinhcong = sum / n ;
        //hien thi ket qua trung binh cong (co lam tron so)
        System.out.format("Trung binh cong cua "+n+" so nguyen da nhap = %.2f", trungbinhcong);
    }
 }