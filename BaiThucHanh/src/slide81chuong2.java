/*Viet chuong trinh nhap vao cac phan tu cho mot ma tran 2 chieu,
 sau do tim va hien thi phan tu co gia tri lon nhat trong ma tran do */
import java.util.Scanner;
public class slide81chuong2{
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so dong cua ma tran: ");
        m = sc.nextInt();
        System.out.print("Nhap vao so cot cua ma tran: ");
        n = sc.nextInt();
        int A[][] = new int[m][n];
        System.out.print("Nhap cac phan tu cho ma tran: ");
        for (int i = 0;i < m; i++){
            for (int j = 0;j < n; j++)
            {System.out.print("A[" + i + "]["+ j + "]= ");
             A[i][j] = sc.nextInt();
            }
        }
    System.out.println("\nMa tran vua nhap : ");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(A[i][j] + "\t");
        }System.out.println("\n");  
    }
    int max = A[0][0];
    for ( int i=0; i<m; i++){
        for(int j=0; j<n;j++){
            if(max < A[i][j]){
               max = A[i][j];
            }
        }
    }
    System.out.println("Phan tu lon nhat trong ma tran = " + max);
    }
}
