// Access Specifier:Access specifier or modifier is the access type of the method.
// It specifies the visibility of the method.Java provides four types of access specifier:

// Public:The method is accessible by all classes when we use public specifier in our application.
// Private:When we use a private access specifier,the method is accessible only in the classes in which it is defined.
// Protected:When we use protected access specifier,the method is accessible within the same package or subclasses in a different package.
//       Default:When we do not use any access specifier in the method declaration,Java uses default access specifier by default.
//       It is visible only from the same package only.
// 





public class AD_10_Method {
    // without static keyword we can't access this method in main class. so if we want to use this in main class so we should create obj and after it use it 
    int preDefineFunc(){

        int a =10;
        return a;
    }
// ---------------------------------------------------------------------------------------------

    // with parameter and static keyword - now we can access this method in a main function
    public static void para(int a, String b){
        int m = a;
        String n = b;
        System.out.println(m);
        System.out.println(n);
    }
// -----------------------------------------------------------------------------------------------

// method overloading is a 




    public static void main(String args[]){
        // with using object create and access value of a method
        AD_10_Method obj = new AD_10_Method();
        System.out.println(obj.preDefineFunc());
        para(10, "JAI SHREE RAM");
    }
    
}
