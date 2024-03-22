package PERSONS;
import java.util.Scanner;
public class EmployeeFullTime extends Employee {
    public void fulltime(){
        System.out.println("**** FULLTIME ****");
    }
     public void tinhluong(){
        super.thongtin();
        luong = sogiolam*luongFulltime1h;
     }
}