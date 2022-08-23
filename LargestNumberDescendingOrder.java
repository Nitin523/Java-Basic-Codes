public interface LargestNumberDescendingOrderimport java.util.*;

public class Main {
  
  public static void formList(List<Integer> list){
    Collections.sort(list, new Comparator<Integer>(){
      
      @Override
      public int compare(Integer num1, Integer num2){
        String a= num1.toString()+ num2.toString();
        String b= num2.toString()+ num1.toString();
        return b.compareTo(a);
      }
    });
  }
  
    public static void main(String[] args) {
      List<Integer> list=Arrays.asList(2,3,30,34,5,9);
      formList(list);
      System.out.print(list);
    }
  } 
}
