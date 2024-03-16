// without argument constructor
class Test{
    Test(){
        System.out.println("This is without argument Constructor ");
    }
}

// with argument constructor
class Test2{
    int m ;
    String n;
    Test2(int a, String b){
        m = a;
        n = b;
        System.out.println(m);
        System.out.println(n);
        

    }
}
public class AD_15_Constructor {
    //non argument constructor
    public static void main(String[] args) {
        
        Test obj = new Test();
        Test2 obj2 = new Test2(0, "Suray");
    }
    
    
}
//1. constructor is a block(similar to method) having same name as that of class Name
//2. does not have any return type. not even void
//3. the only modifiers applicable for constructor are public,protected,default and private
//4. it execute automatically when we create an object
