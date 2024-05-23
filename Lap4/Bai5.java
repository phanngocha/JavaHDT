package Lap4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SinhVien {
    private String maSV;
    private String tenSV;
    private String lop;

    public SinhVien(String maSV, String tenSV, String lop) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getLop() {
        return lop;
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Map<String, SinhVien> danhSachSV = new HashMap<>();
        danhSachSV.put("2221050025", new SinhVien("2221050025", "Phan N H", "DCCTCT67C1"));
        danhSachSV.put("2221050026", new SinhVien("2221050026", "Tran Thi B", "DCCTCT67C1"));
        danhSachSV.put("2221050027", new SinhVien("2221050027", "Le Van C", "DCCTCT67C2"));

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ma sinh vien:");
        String maSV = scanner.nextLine();
        SinhVien sv = danhSachSV.get(maSV);
        if (sv != null) {
            System.out.println("Sinh vien: " + sv.getTenSV());
            System.out.println("Lop: " + sv.getLop());
        } else {
            System.out.println("Khong tim thay " + maSV);
        }

        System.out.println("Nhap ten lop:");
        String tenLop = scanner.nextLine();
        System.out.println("Danh sach sinh vien trong lop " + tenLop + ":");
        for (SinhVien sinhVien : danhSachSV.values()) {
            if (sinhVien.getLop().equals(tenLop)) {
                System.out.println("Ma sinh vien: " + sinhVien.getMaSV() + ", Ten sinh vien: " + sinhVien.getTenSV());
            }
        }
    }
}