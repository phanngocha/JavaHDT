/*Viet chuong trinh nhap vao mot chuoi bat ky bao gom ca so,
 ky tu thuong va ky tu hoa tu ban phim. Sau do dem va in ra so ky tu thuong, ky tu hoa va so co trong chuoi do. */
 import java.util.Scanner;
 public class Bai9 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        System.out.print("Nhap chuoi bat ky bao gom ca so, ky tu thuong, ky tu hoa: ");
        chuoi = scanner.nextLine();
        int demso = 0 , demchuhoa = 0 , demchuthuong = 0;
        for(int i=0;i < chuoi.length();i++) {
            if(chuoi.charAt(i) >= 97 && chuoi.charAt(i) <= 122 ) {
                ++demchuthuong;
            } else if (chuoi.charAt(i) >= 65 && chuoi.charAt(i) <= 90) {
                ++demchuhoa;
            } else if (chuoi.charAt(i) >= 48 && chuoi.charAt(i) <= 57) {
                ++demso;
            } else {
                System.out.println("Chuoi co ki tu khong hop le");
            }
        }
        System.out.println("So ki tu thuong trong chuoi la: "+demchuthuong);
        System.out.println("So ki tu hoa trong chuoi la: "+demchuhoa);
        System.out.println("So ki tu so trong chuoi la: "+demso);
    }
}