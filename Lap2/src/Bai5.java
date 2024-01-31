/*Viet chuong trinh nhap vao cac so nguyen va tinh tong cac so do, neu tong >100 thi ket thuc vong lap
 va hien thi thong bao tong cua cac so da nhap */
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        String str = "";
        while (tong <= 100) {
            System.out.print("Nhap so nguyen : ");
            int n = sc.nextInt();
            tong += n;
            str = str + n + " + ";
        }
        System.out.println(str.substring(0,str.length()-2)+ "= "+tong);

    }
}