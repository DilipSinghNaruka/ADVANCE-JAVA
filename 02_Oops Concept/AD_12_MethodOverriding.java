//  polymorphism have two part 
// 1. Method overloading
// 2. Method overriding
// for gaining Method overriding we need this requirements 
// -> Method Name same
// -> Inheretance(IS-A relationship)
// -> Different class 
// -> same arguments

class Test{
    void show(){
        System.out.println("this is parent class");
    }
}
class Test2 extends Test{
    void show(){
        System.out.println("this is child class");
    }
}

public class AD_12_MethodOverriding {
        public static void main(String[] args) {
            Test obj = new Test();
            obj.show(); // output is parent class

            Test2 obj1 = new Test2();
            obj1.show(); // output is child class 
            // Note: we can't see parent class function by using the create obj of child class



        }

    
}
