import java.util.LinkedHashSet;

public class cf_06LInkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(34);
        lhs.add(34); // we can not store duplicate value inside this 
        lhs.add(24); // we can not store duplicate value inside this 
        lhs.add(44); // we can not store duplicate value inside this 
        System.out.println(lhs);
    }
    
}
