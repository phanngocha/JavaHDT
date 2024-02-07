/*Viet chuong trinh nhap tu ban phim mot chuoi khong qua 80 ky tu va mot ky tu bat ky.
 Dem va in ra man hinh so lan xuat hien cua ky tu do trong chuoi vua nhap */
 import java.util.Scanner;
 public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        char kitu;
        int dem=0;
        do{
            System.out.print("Nhap chuoi ky tu bat ky: ");
            chuoi = scanner.nextLine();
            System.out.print("Nhap mot ky tu: ");
            kitu= scanner.next().charAt(0);
            for(int i=0;i<chuoi.length();i++){
                if(chuoi.charAt(i)==kitu){
                    dem++;
                }
            }
            System.out.println("So lan xuat hien cua ky tu trong chuoi la: "+dem);
        }
        while(chuoi.length()>80);   
    }
}