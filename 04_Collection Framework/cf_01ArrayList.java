import java.util.*;

public class cf_01ArrayList {
   public static void main(String []args){
    ArrayList array = new ArrayList<>();
    ArrayList arr  = new ArrayList<>();
    array.add(12);
    array.add("suray");
    array.add("vansi");
    arr.add("Anything");
    arr.addAll(array); // Appends all of the elements in the specified collection to the end of this
                       // list, in the order that they are returned by the specified collection's
                       // Iterator.

    arr.clear();    //Removes all of the elements from this list.
    System.out.println(array.contains("suray")); //Returns true if this list contains the specified element.
    System.out.println(array.get(2)); // Returns the element at the specified position in this list.
    array.remove(0); // Removes the element at the specified position in this list.
    System.out.println(array);
    array.removeAll(arr); // Removes from this list all of its elements that are contained in the
                          // specified collection.








    // System.out.println(array);
    // System.out.println(arr);

    // Traversing list through Iterator
    // Iterator itr = array.iterator();
    // while(itr.hasNext()){
    //     System.out.println(itr.next());
    // }




   }
    
}