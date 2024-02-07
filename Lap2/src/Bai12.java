/*Viet chuong trinh nhap vao cac phan tu cho mot ma tran 2 chieu, 
sau do tim va hien thi phan tu co gia tri lon nhat trong ma tran do. */
import java.util.Scanner;
public class Bai12 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int m,n;
        System.out.print("Nhap so hang cua ma tran: ");
        m=scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        n=scanner.nextInt();
        int A[][]=new int[m][n];
        System.out.println("Nhap cac phan tu co trong ma tran : ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("Nhap vao phan tu ["+i+"]["+j+"] : ");
                A[i][j]=scanner.nextInt();
            }
        }
        System.out.println("\nMa tran vua nhap : ");
        for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++){
            System.out.print(A[i][j] + "\t");
           }
           System.out.print("\n");  
        }
        int max=A[0][0];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(A[i][j]>max){
                    max=A[i][j];
                }
            }
        }        
    System.out.println("\nPhan tu lon nhat trong ma tran la: "+max);
    }
}