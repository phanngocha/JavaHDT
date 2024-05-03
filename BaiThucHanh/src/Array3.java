import java.util.ArrayList;
import java.util.ListIterator;

public class Array3 {
  public static void main(String[] args) {
      ArrayList<Character> arrayListcChar = new ArrayList<>();

      arrayListcChar.add('a');
      arrayListcChar.add('e');
      arrayListcChar.add('b');
      arrayListcChar.add('c');

      ListIterator<Character> listIterator = arrayListcChar.listIterator();

      System.out.println("Cac phan tu trong arrListChar la: ");
      while (listIterator.hasNext()) {
        System.out.println(listIterator.next()+"\t");
      }
  } 
}
