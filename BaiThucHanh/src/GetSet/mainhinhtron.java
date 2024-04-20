package GetSet;

public class mainhinhtron {
  
  public static void main(String[] args) {
      Hinhtron ht = new Hinhtron();
      ht.setBanKinh(10);
      double chuvi = ht.tinhChuVi();
      double dientich = ht.tinhDienTich();
      System.out.println("Chu vi hình tròn: " + chuvi + " ; \nDiện tích: " + dientich);
  }
}