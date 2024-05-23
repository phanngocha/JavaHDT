package Lap4.Bai3;

import java.util.Scanner;
import java.util.LinkedList;

public class Sinhvien {

    public String ten;
    public float diem;

   
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien: ");
        ten = scanner.nextLine();
        System.out.print("Nhap diem cua sinh vien: ");
        diem = scanner.nextFloat();
    }

    
    public void xuatThongTin() {
        System.out.println("Sinh vien: " + ten + " - Diem: " + diem);
    }

    public void addStudent(LinkedList<Sinhvien> danhSachSinhVien) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin sinh vien: ");
        while (true) {
            Sinhvien sv = new Sinhvien();
            sv.nhapThongTin();
            if (sv.ten.isEmpty()) {
                break; 
            }
            danhSachSinhVien.add(sv);
            System.out.println("Sinh vien da duoc them vao danh sach.");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Danh sach khi them sinh vien:");
        for (Sinhvien sv : danhSachSinhVien) {
            sv.xuatThongTin();
        }
    }

    
    public void demSoSinhVienThiLai(LinkedList<Sinhvien> danhSachSinhVien) {
        int dem = 0;
        for (Sinhvien sv : danhSachSinhVien) {
            if (sv.diem <= 5) {
                dem++;
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Tong so sinh vien phai thi lai ( do diem <=5): " + dem);
    }

    public void hienThiSinhVienDiemMax(LinkedList<Sinhvien> danhSachSinhVien) {
        float maxDiem = danhSachSinhVien.getFirst().diem;
        for (Sinhvien sv : danhSachSinhVien) {
            if (sv.diem > maxDiem) {
                maxDiem = sv.diem;
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Sinh vien co diem cao nhat: ");
        for (Sinhvien sv : danhSachSinhVien) {
            if (sv.diem == maxDiem) {
                sv.xuatThongTin();
            }
        }
    }
 

    public void timSinhVienTheoTen(LinkedList<Sinhvien> danhSachSinhVien) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------------");
        System.out.print("Nhap ten sinh vien can tim: ");
        String tenCanTim = scanner.nextLine();
        boolean timThay = false;
        for (Sinhvien sv : danhSachSinhVien) {
            if (sv.ten.equalsIgnoreCase(tenCanTim)) {
                System.out.println("Thong tin sinh vien can tim:");
                sv.xuatThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sinh vien " + tenCanTim);
        }
    }

    public static void main(String[] args) {
        LinkedList<Sinhvien> danhSachSinhVien = new LinkedList<>();
        Sinhvien sv = new Sinhvien();
        sv.addStudent(danhSachSinhVien);
        sv.demSoSinhVienThiLai(danhSachSinhVien);
        sv.hienThiSinhVienDiemMax(danhSachSinhVien);
        sv.timSinhVienTheoTen(danhSachSinhVien);
    }
}