package PERSONS;
import java.util.Scanner;
public class Employee extends Person {
    public String EmployeeID;
    public double luong;
    public int sogiolam;
    public final double luongPartime1h = 100000;
    public final double luongFulltime1h = 200000; 
  
    public void thongtin(){
        super.nhapthongtin();
        super.xuatthongtin();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ma nhan vien: ");
        EmployeeID = scanner.nextLine();
        System.out.print("Nhap so gio lam trong mot ngay: ");
        sogiolam = scanner.nextInt();
    }
    public void inluong(){
        System.out.print("Luong cua nhan vien trong mot ngay: "+luong+" dong");
    }
}
