package Slide80chuong3;

public class main {
   public static void main(String[] args) {
    NhanVienFullTime sep = new NhanVienFullTime("Phan Jr");
    sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
    NhanVienFullTime linh1 = new NhanVienFullTime("Phan Van A");
    linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
    NhanVienFullTime linh2 = new NhanVienFullTime("Phan Van B",5);
    linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
    NhanVienPartTime linh3 = new NhanVienPartTime("Phan Van C", 50);

    sep.tinhLuong();
    linh1.tinhLuong();
    linh2.tinhLuong();
    linh3.tinhLuong();
    
    sep.xuatThongTin();
    linh1.xuatThongTin();
    linh2.xuatThongTin();
    linh3.xuatThongTin();
   }
  }