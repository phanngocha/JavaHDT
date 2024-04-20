package GetSet;

public class Hinhtron {

    private final double PI = Math.PI;
    private double bankinh;

    public double getBanKinh(){
        return bankinh;
    }

    public void setBanKinh(double bankinh){
        if (bankinh < 0) {
            System.out.println("Bán kính không thể là một giá trị âm.");
            return;
        }
        this.bankinh = bankinh;
    }

    public double tinhChuVi(){
        return 2 * PI * bankinh;
    }

    public double tinhDienTich(){
        return PI * bankinh * bankinh;
    }
}