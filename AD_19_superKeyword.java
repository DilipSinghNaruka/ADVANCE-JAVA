// super keyword is a reference variable whifck is used to refer immediate parent class object
// USES OF "SUPER" KEYWORD
    // 1. "super" keyword can be used to refer immediate parent class instance varuable.
    // 2. "super" keyword can be used to invoke immediate parent class method
    // 3. super() can be used to invoke immediate parent class constructor

class A{
    int a = 10;
} 

class B extends A{
    int a = 20;
    void show(int a){
        // System.out.println(a);// here is output - 30
        System.out.println(this.a); // here is 20 becouse this keyword refer in a class
        System.out.println(super.a);// here is 10 because super keyword refer to the parent class
    }

}

public class AD_19_superKeyword {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(30);

    }
    
}
