import java.util.Scanner;
public class Employee {

    public static void main(String[] args) {

    }
    public String tennhanvien;
    public int sodienthoai;
    public int luong;
    public final int thuong = 1000000;
    public int tamUng;
    
    public void nhapthongtin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten nhan vien: ");
        tennhanvien = scanner.nextLine();
        System.out.print("Nhap so dien thoai: ");
        sodienthoai = scanner.nextInt();
       System.out.print("Nhap luong: ");
        luong = scanner.nextInt();
        System.out.print("Nhap so tien tam ung: ");
        tamUng = scanner.nextInt();

    }
    public void xuatthongtin(){
        System.out.println("Ten cua nhan vien : "+tennhanvien);
        System.out.println("So dien thoai cua nhan vien: "+sodienthoai);
    }
    public void tinhluong(){
        long tinhluong = luong + thuong - tamUng;
        System.out.println("Luong cua nhan vien: "+tinhluong);
    }
}