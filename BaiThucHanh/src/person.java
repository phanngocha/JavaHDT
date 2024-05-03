import java.util.Scanner;

public class person {

      public int PersoniD;
      public String name;
      public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        PersoniD = sc.nextInt();; sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
      }
      public void xuatthongtin(){
        System.out.println("id: "+PersoniD+", name: "+name);
      }
} 