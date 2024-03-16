//  what is inheritance ?
// ans-> It is ineriting the properties of parent class into child class 
// Inheritance is the procedure by which one object acquires all the properties and behaviors of a parent boject.
// Types of Inheritance ===
    // 1. Single Inheritance   -- In Single Inheritance one class extends another class (one class only)
    // 2. Multilevel Inheritance -- In multilevel Inheritamce, one class can inherit from a derived class. Hence, the derived class becomes the base class for the new class
    // 3. Hierarical Inheritance  -- In Hierarchical Inehritance, one class is inherited by many sub classes.
    // 4. Multiple Inheritance --- This is not in Java -- In This one class extending more than one class. Java does not support multiple inheritance
    // 5. Hybrid Inheritance   --- This is also not in java --- this is a combination of any two inheritance ajva does not support hybrid Inheritance.
    // Advantages of Inheritance :-- code Reusability, It promotes runtime polymorphism by allowing method overriding
    // Disadvantages of Inheritance :- Uisng inheritance the two classes (parent and child class) gets lightly coupled.
    // --Inheritance is achieved by using "exteds" keyword.
    // -- Every class has a super or say parent class i.e. Object class (but object class does not have any parent class)
    // BELOW DOES NOT TAKE PART IN iNHERITANCE
            // - CONSTRUCTOR -> A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructor of the superclass can be involed from the subclass.
            // - PRIVATE MEMBERS -> A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods(like getters and setters) for accessing its private fields, these can also be use by the subclass.
    // -- There can be only one super class, not more than that because java does not support multiple inheritance.




    // ------------------------- This is Single Inheritance -----------------------------
// class Test{
//     int a = 10;
//     String b = "new";
    
// }

// public class AD_16_Inheritance extends Test {
//     void func() {
//         System.out.println(a);
//         System.out.println(b);
//     }
//     public static void main(String[] args) {
//         AD_16_Inheritance obj = new AD_16_Inheritance();
//         obj.func();
//     }
    
// }



// ------------------------------- This is Multilevel Inheritance -------------------------------

// class Test {
//     int a = 10;
    
// }
// class Test2 extends Test{
//     String b = "new";

// }

// public class AD_16_Inheritance extends Test2 {
//     void func() {
//         System.out.println(a);
//         System.out.println(b);
//     }

//     public static void main(String[] args) {
//         AD_16_Inheritance obj = new AD_16_Inheritance();
//         obj.func();
//     }

// }

// ------------------------------- This is Hierarical Inehitance -------------------------
class Test {
    int a = 10;

}

class Test2 extends Test {
    String b = "new";

}

public class AD_16_Inheritance extends Test {
    void func() {
        System.out.println(a);
        // System.out.println(b); // this will be not exicute just becouse of hierarical ineheritance
    }

    public static void main(String[] args) {
        AD_16_Inheritance obj = new AD_16_Inheritance();
        obj.func();
    }

}