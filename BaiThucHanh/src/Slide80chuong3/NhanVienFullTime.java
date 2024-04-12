package Slide80chuong3;

public class NhanVienFullTime extends NhanVien{
    private int ngayLamThem;
    private int loaiChucVu;
    public NhanVienFullTime(String ten){
        this.ten = ten;
    }
    public NhanVienFullTime( String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void setLoaiChucVu( int loaiChucVu){
        this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan vien toan thoi gian";
    }
    public void tinhLuong(){
        if(loaiChucVu == Configs.NHAN_VIEN_SEP){
        luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + Configs.LUONG_LAM_THEM_MOT_NGAY*ngayLamThem;
    }else{
        luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + Configs.LUONG_LAM_THEM_MOT_NGAY*ngayLamThem;
    }
    }
}