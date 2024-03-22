package HINHHOC;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    public HinhChuNhat(){
        ten = "Hinh chu nhat";
    }
    public void nhapChieuDai(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = scanner.nextFloat();
    }
    public void nhapChieuRong(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        rong = scanner.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = (dai+rong)*2;
    }
    public void tinhDienTich(){
        dienTich = dai*rong;
    }
}