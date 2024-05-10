import java.util.HashSet;
import java.util.Scanner;

public class Hashadd {
   public static void main(String[] args) {
    int number;
    HashSet<Integer> hashSetInteger = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    hashSetInteger.add(0);
    hashSetInteger.add(3);
    hashSetInteger.add(1);
    hashSetInteger.add(4);
    hashSetInteger.add(2);
    hashSetInteger.add(8);
    
    System.out.println("Cac phan tu trong hashSetInteger: ");
    System.out.println(hashSetInteger);
    System.out.println("Nhap phan tu can them: ");
    number = scanner.nextInt();

    if(!hashSetInteger.contains(number)){
        hashSetInteger.add(number);
        System.out.println("Them thanh cong!");
        System.out.println("Cac phan tu hashSetInteger sau khi them: ");
        System.out.println(hashSetInteger);
    }else{
        System.out.println("Phan tu "+number + " da ton tai!");
     }
   } 
}
