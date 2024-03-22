package HINHHOC;
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
    public HinhVuong(){
        ten = "Hinh vuong";
    }
    public void nhapCanh(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh hinh vuong: ");
        dai = rong = scanner.nextFloat();
        super.tinhChuVi();
        super.tinhDienTich();
    }
}
