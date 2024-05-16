package Lap4;
import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        /*xay dung 1 danh sach lien ket LinkedList luu tru n so nguyen duong (n nhap tu ban phim) tinh tbc cac so chan, hien thi */
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int n, number;
      
        System.out.println("Nhap so phan tu trong danh sach: ");
        n = scanner.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.println("Nhap phan tu thu "+i+" : ");
            number = scanner.nextInt();

            if(number>0){
            list.add(number);
            } else {System.out.println("Error!!");
               }
        }
        int sophantu = 0;
        double trungbinhcong, tong = 0.0 ;
        for (int so : list){
            if( so % 2 == 0 ){
                sophantu++;
                tong += so;           
            }  
        }
         trungbinhcong = tong / sophantu;
         System.out.println("Trung binh cong cac so chan = "+trungbinhcong);
    }
}