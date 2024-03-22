package PERSONS;
import java.util.Scanner;
public class Person {
    public String name;
    public int age;
    public void nhapthongtin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        age = scanner.nextInt();
        }
    public void xuatthongtin(){
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
    }
}