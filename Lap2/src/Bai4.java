/*Viet chuong trinh nhap vao mot so nguyen tu 1 -> 12 tu ban phim
 va hien thi ra thang tuong ung voi so do ( nhap vao so 1 thi se hien ra la "Thang 1"). */ 
import java.util.Scanner;
public class Bai4 {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap vao mot so nguyen 1 -> 12 : ");
            int so = sc.nextInt();
            switch (so) {
                case 1:System.out.print("Thang 1");
                    break;
                case 2:System.out.print("Thang 2");
                    break;
                case 3:System.out.print("Thang 3");
                    break;
                case 4:System.out.print("Thang 4");
                    break;
                case 5:System.out.print("Thang 5");
                    break;
                case 6:System.out.print("Thang 6");
                    break;
                case 7:System.out.print("Thang 7");
                    break;
                case 8:System.out.print("Thang 8");
                    break;
                case 9:System.out.print("Thang 9");
                    break;
                case 10:System.out.print("Thang 10");
                    break;
                case 11:System.out.print("Thang 11");
                    break;
                case 12:System.out.print("Thang 12");
                    break;
                default:System.out.print("Nhap so thang khong hop le!");
                    break;
            }
         }
}