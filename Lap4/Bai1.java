package Lap4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            int n;
            System.out.println("Nhap vao so phan tu: ");
            n = scanner.nextInt();
             
            for( int i = 0; i< n; i++){
                System.out.println("Nhap phan tu thu "+i+" : ");
                int number = scanner.nextInt();
                arrayList.add(number);
            }  
           
        System.out.println("--------------------------\n");
            System.out.println("Cac phan tu  trong day la : ");
            for( int number : arrayList){
                  System.out.print(number + "\t");
            }

            int max = arrayList.get(0);
            for(int i=1; i< arrayList.size(); i++){
                 if( arrayList.get(i).compareTo(max) >0){
                     max = arrayList.get(i); 
                 }
            }
            System.out.println("\n\nPhan tu lon nhat trong day = "+max);
  
        System.out.println("------------------------------------\n");
            System.out.print("Nhap vao mot so nguyen duong can xoa: ");
            int socanxoa = scanner.nextInt();
            for (int i = arrayList.size() - 1; i >= 0; i--) { 
                if (arrayList.get(i) == socanxoa) {
                    arrayList.remove(i);
                }
            }
            
            arrayList.sort((o1,o2)->(o1-o2));
            System.out.println("\nDay so sau khi xoa va sap xep:");
            for (int so: arrayList) {
                 System.out.print(so + "\t");
            }

    }
}