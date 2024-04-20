package GetSet;
public class mainsinhvien{
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien();
        Sinhvien sv2 = new Sinhvien();

        sv1.setTen("");
        sv1.setTuoi(20);

        sv2.setTen("Luffy");
        sv2.setTuoi(17);

        System.out.println("sinh vien 1 co ten: "+sv1.getTen()+",\ttuoi: "+sv1.getTuoi());
        System.out.println("sinh vien 2 co ten: "+sv2.getTen()+",\ttuoi: "+sv2.getTuoi());
    }
}
