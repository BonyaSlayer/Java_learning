import java.util.ArrayList;
import java.util.Collections;

public class CASE2 {
    public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<>();
    list.add(12);
    list.add(23);
    list.add(56);
    
    int a = Collections.max(list);
    int b = Collections.min(list);
    double mid = a/b;

    System.out.println(a);
    System.out.println(b);
    System.out.println(mid); 
    

    }    
}
