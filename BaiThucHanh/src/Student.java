import java.util.Scanner;
public class Student {
    public static void main(String[] args) {     
    }
    public String name, mssv;
    public float diemmonA,diemmonB,diemmonC;
    
    public void nhapthongtin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten sinh vien: ");
        name = scanner.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        mssv = scanner.nextLine();
        System.out.print("Nhap diem mon A: ");
        diemmonA = scanner.nextFloat();
        System.out.print("Nhap diem mon B: ");
        diemmonB = scanner.nextFloat();
        System.out.print("Nhap diem mon C: ");
        diemmonC = scanner.nextFloat();


    }
    public void xuatthongtin(){
        System.out.println("Ho va ten: "+name);
        System.out.println("Ma so sinh vien: "+mssv);
    }
    public void diemtongket(){
        float dtk = (diemmonA+diemmonB+diemmonC)/3;
        System.out.format("Diem tong ket mon = %.2f",dtk);
    }
}