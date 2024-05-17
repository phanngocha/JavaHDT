import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class Slide89chuong4 {
   public static void main(String[] args) {
      HashMap<String, String> hashMapCity = new HashMap<>();
      hashMapCity.put("QNg", "Quang Ngai");
      hashMapCity.put("QN", "Quang Nam");
      hashMapCity.put("QN", "Quang Ninh");
      hashMapCity.put("HCM", "Thanh pho Ho Chi Minh");

      System.out.println("Danh sach cac thanh pho trong hashMapCity: ");
      Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
      System.out.println(setCity);
      
      System.out.println("QNg: "+hashMapCity.get("QNg"));
      System.out.println("PN: "+hashMapCity.get("PN"));

      if(hashMapCity.containsValue("Thanh pho Ho Chi Minh")){
        System.out.println("Co thanh pho Ho Chi Minh trong hashMapCity");
      }
   }
}