package HINHHOC;
import java.util.Scanner;
public class HinhTron extends HinhHoc {
    public float banKinh;
    public HinhTron(){
        ten = "Hinh Tron";
    }
    public void nhapBanKinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = scanner.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = PI*banKinh*2;
       }
    public void tinhDienTich(){
        dienTich = PI*banKinh*banKinh;
    }

}
