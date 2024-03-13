import java.util.Scanner;
public class HinhTron {
    public static void main(String[] args) {
    }
        public final float PI = 3.14f;
        public float r;
        public float chuvi;
        public float dientich;

        public void nhapBanKinh(){
             Scanner scanner = new Scanner(System.in);
             System.out.print("Nhap ban kinh hinh tron: ");
             r = scanner.nextFloat();
        }
        public void tinhChuVi(){
            chuvi = r*2*PI;
        }
        public void tinhDienTich(){
            dientich = r*r*PI;
        }
        public void inChuVi(){
            System.out.println("Chu vi hinh tron = "+chuvi);
        }
        public void inDienTich(){
            System.out.println("Dien tich hinh tron = "+dientich);
        }
}