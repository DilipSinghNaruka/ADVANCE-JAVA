//static variable are used for memory management
// when a variable is declared as static. thena a single copy of variable is created and shared among all objects at class level. 


// ----------------------------- Static variable -------------------------------

// public class AD_21_staticKeyword {
//     int empid;
//     String name;
//     static String company = "google"; // now this is occufy memory only once if we create multiple objects

//     AD_21_staticKeyword(int empid, String name){
//         this.empid= empid;
//         this.name = name;

//     }
//     void display(){
//         System.out.println(empid+" " + name+ " " + company);
//     }
//     public static void main(String[] args) {
//         AD_21_staticKeyword obj = new AD_21_staticKeyword(23, "suray");
//         obj.display();
//     }
    
// }


// --------------------------- static method -----------------------------------------------
// static, methods belings to class, not object
// static methods can be called directly by class names follows className.methodName();
// static methods belongs to the class, not to the object.
// a "Static" method can be accessed directly by class name and does'nt need any object.
// a "static" method can access only static data. it cannot access non-static data (instance data)
// a "static" method can call only other static methods and cannot call a non-static method.
// a "static" method cannot refer to "this" or "super" keyword in anyway.
// A static methods can call only other stataic methods and cannot call a non-static methood 
class Test{
    static void print(){
        System.out.println("this is test class");
    }
}
public class AD_21_staticKeyword {
    public static void main(String[] args) {
        Test.print();   // in static method we directly call it without creating object if we are in same class so we direcly call it with method name
    }
    
}


// ----------------------------------