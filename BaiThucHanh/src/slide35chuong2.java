/*Viet chuong trinh nhap vao hai so va in ra so nho nhat trong hai so */
import java.util.Scanner;
public class slide35chuong2{
    public static void main(String[] args) {
        int sothunhat,sothuhai;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so thu nhat = ");
        sothunhat=sc.nextInt();
        System.out.print("Nhap so thu hai = ");
        sothuhai=sc.nextInt();
        int min=sothunhat;
        if(sothunhat>sothuhai)
           min=sothuhai;
          {System.out.print("so nho nhat trong hai so "+sothunhat+" va "+sothuhai+" la "+min);}
    }
}