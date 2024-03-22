package PERSONS;
import java.util.Scanner;
public class EmployeePartTime extends Employee{
    public void parttime(){
        System.out.println("\n**** PARTTIME ****");
    }
    public void tinhluong(){
        super.thongtin();
        luong = sogiolam * luongPartime1h;
    }
}