import java.util.TreeSet;

public class cf_07TreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(23);
        ts.add(23);
        ts.add(13);
        ts.add(33);
        System.out.println(ts); // sorted unique value 
    }
}
