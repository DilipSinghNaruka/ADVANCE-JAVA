import java.util.LinkedList;

public class cf_02LinkedLIst {
    public static void main(String[] args) {
        LinkedList link = new LinkedList<>();
        link.add(22);
        link.addFirst(21); // Inserts the specified element at the beginning of this list.
        link.addLast(23); // Appends the specified element to the end of this list.
        // link.clear();      // Removes all of the elements from this list.
        System.out.println(link.getFirst()); //	Returns the first element in this list.
        System.out.println(link.getLast()); //	Returns the last element in this list.
        System.out.println(link.size());



        System.out.println(link);
    }
    
}
