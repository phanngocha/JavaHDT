import java.util.Scanner;
public class Bai1 {
       public static void main(String[] args) {
        double a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap a = ");
        a=sc.nextDouble();
        System.out.print("Nhap b = ");
        b=sc.nextDouble();
        System.out.println("Tong hai so la : "+(a+b));
        System.out.println("Hieu hai so la : "+(a-b));
        System.out.println("Tich hai so la : "+(a*b));
        System.out.println("Thuong hai so la : "+(a/b));
        System.out.println("Chia lay du cua hai so la : " +(a%b));
        if(a>b){System.out.println("a lon hon b ");}
           else{if(a==b){System.out.print("a = b ");}
                else {System.out.print("a be hon b ");}
               }
        }
}