//  polymorphism have two part 
    // 1. Method overloading
    // 2. Method overriding
// for gaining Method overloading we need this requirements 
    // -> Method Name same
    // -> class Name same
    // -> Different arguments
            // nbmr of argument
            // seq. of arg.
            // Type of arg.



public class AD_11_MethodOverloading {

    // Number of Arguments
    // void show (){
    //     System.out.println("In this have 0 arguments");
        
    // }
    
    // void show (int a){
    //     System.out.println("In this have 1 arguments");

    // }
// ---------------------------------------------------------------------------------

//  Sequence of Arguments
    
    // void show (int a, String b){
    //     System.out.println("In this have first one is int and second one is String");

    // }
    
    // void show(String a, int b) {
    //     System.out.println("In this have first one is String and second one is int");

    // }
    // -------------------------------------------------------------------------------------
    

    // Type of seq
    void show (String a){
        System.out.println("This is String ");
    }
    
    void show (int a){
        System.out.println("This is int");

    }
    

    public static void main(String[] args) {
        AD_11_MethodOverloading obj = new AD_11_MethodOverloading();

        // Number of Argument
        // obj.show();
        // obj.show(0);
        
        // Seq of Argument
        // obj.show(10, "Dilip");
        // obj.show("Dilip", 20);
        
        // // Type of Argument
        obj.show("Dilip");
        obj.show(0);
        
    }
    
}
