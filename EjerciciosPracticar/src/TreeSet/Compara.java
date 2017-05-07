package TreeSet;
import java.util.*;
public class Compara implements Comparator{
    
    public int compare (Object x1, Object x2){
        String c1 = (String) x1;
        String c2 = (String) x2;
        c1 = c1.toUpperCase();
        c2 = c2.toUpperCase();
        return c1.compareTo(c2);
    }
}
