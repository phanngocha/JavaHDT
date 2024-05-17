import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class Slide87chuong4 {
      public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("CSLT", "Co so lap trinh");
        hashMap.put("C++","C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java", "Java");

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("cac entry co trong setHashMap: ");
        System.out.println(setHashMap);
      }   
}