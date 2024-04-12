package Slide80chuong3;

public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;
    public NhanVienPartTime(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan vien thoi vu";
    }
    public void tinhLuong(){
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOT_GIO * gioLamViec;
    }
}
