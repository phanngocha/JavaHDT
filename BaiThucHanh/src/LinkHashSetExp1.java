import java.util.Set;
import java.util.LinkedHashSet;
public class LinkHashSetExp1 {
   public static void main(String[] args) {
    Set<String> linkHashSet = new LinkedHashSet<String>();
    linkHashSet.add("Java");
    linkHashSet.add("C++");
    linkHashSet.add("Java");
    linkHashSet.add("PHP");

    for( String str : linkHashSet){
        System.out.println(str);
    }
   } 
}
