import java.util.ArrayList;

public class personarray {
    public static void main(String[] args) throws Exception{
        ArrayList<person> arrayListperson = new ArrayList<>();
        for(int i = 0; i<3; i++){
            person ps = new person();
            ps.nhapthongtin();
            arrayListperson.add(ps);
        }
        for (int i = 0; i<arrayListperson.size();i++){
            arrayListperson.get(i).xuatthongtin();
        }
    }
}