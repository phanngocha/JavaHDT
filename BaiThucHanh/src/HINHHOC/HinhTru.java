package HINHHOC;
import java.util.Scanner;
public class HinhTru extends HinhTron {
    public float chieuCao;
    public HinhTru(){
        ten = "Hinh Tru";
    }
    public void nhapChieuCao(){
        super.nhapBanKinh();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        chieuCao = scanner.nextFloat();
    }
    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich*chieuCao;
    }
}
