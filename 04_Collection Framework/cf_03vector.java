import java.util.Vector;

public class cf_03vector {
    public static void main(String[] args) {
      // Constrator-> Vector​(int initialCapacity, int capacityIncrement)	 //Constructs an empty vector with the specified initial capacity and capacity increment.
      Vector vec = new Vector<>();
      vec.add(12);
      vec.add("ram");
      System.out.println(vec.hashCode()); // Returns the hash code value for this Vector.

    }
}
