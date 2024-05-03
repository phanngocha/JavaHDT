import java.util.ArrayList;

public class Array1 {
   public static void main(String[] args) {
    ArrayList<String> arrayListString = new ArrayList<>();

    arrayListString.add("Java");
    arrayListString.add("PHP");
    arrayListString.add("c#");
    arrayListString.add("c++");

    System.out.println("cac phan tu trong arrListString la : ");
    for( int i = 0;i<arrayListString.size(); i++){
        System.out.println(arrayListString.get(i) + "\t");
    }
   }
}