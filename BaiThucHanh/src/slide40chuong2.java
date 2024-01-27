/*Viet chuong trinh nhap vao mot so ngay va hien thi tuong ung trong tuan le. */    
import java.util.Scanner;
public class slide40chuong2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ngay : ");
        int ngay=sc.nextInt();
        switch (ngay) {
            case 1:System.out.print("Chu Nhat");
                break;
            case 2:System.out.print("Thu hai");
                break;
            case 3:System.out.print("Thu ba");
                break;
            case 4:System.out.print("Thu tu");
                break;
            case 5:System.out.print("Thu nam");
                break;
            case 6:System.out.print("Thu sau");
                break;
            case 7:System.out.print("Thu bay");
                break;
            default:System.out.print("Nhap so ngay khong hop le!");
                break;
        }
    }
}
