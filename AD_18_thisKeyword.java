//"This" keyword is the reference variable that refers to the current object
// The most common use of the this keyword is to eliminate the confusion between
// class attributes
// and parameters
// with the

// same name (because a class attribute is shadowed by a method or constructor parameter). If you omit the keyword in the example above, the output would be "0" instead of "5".

// this CAN ALSO BE USED TO:
        // this keyword can be used to to refer current class instance varuable.
        // this keyword can be used to invoke current class method(implicitly)
        // this() can be used to invoke current class constructor
        // this can be used to pass as an argument in the method call.
        // this can be used to pass as an argument in the constructor call.
        // this can be used to retur the current class instance from the method

class Test{
    int x;
    public Test(int x){
        this.x = x;
    }
}

public class AD_18_thisKeyword {
    public static void main(String[] args) {
        Test obj = new Test(10);
        System.out.println(obj.x);
    }
    
}
