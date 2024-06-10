import java.util.Stack;

/**
 * cf_04Stack
 */
public class cf_04Stack {

    public static void main(String[] args) {
        Stack st = new Stack<>();
        st.push(21);
        st.push(22);
        st.push("ram");
        st.push("syam");
        System.out.println(st.peek()); // Looks at the object at the top of this stack without removing it from the
                                       // stack.
        st.pop(); // Removes the object at the top of this stack and returns that object as the
                  // value of this function.
        System.out.println(st.empty());     // Tests if this stack is empty.     
        System.out.println(st.search("ram")); // Returns the 1-based position where an object is on this stack.
        System.out.println(st);                               
    }
}