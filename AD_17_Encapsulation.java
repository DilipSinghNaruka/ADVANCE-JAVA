//Encapsulation in Java is a mechnism of wripping the data (variables) and code acting on the data (methods) together as a single unit.
//STEP TO ACHIEVE ENCAPSULATION -
    // 1. Declare the variable of a class as private.
    // 2. Provide public setter and getter methods to  modify and view the variables values.
// In encapsulation, the varuables of a class will be hidden from other classes, and can be accessed onlhy through the methods of their current class. This concept is known as Data Hiding
class Test{
    private int age ;
    public void setter(int agee){
        age = agee;
    } 
    public void getter (){
        System.out.println(age);

    }
}

public class AD_17_Encapsulation  {
    public static void main(String[] args) {
        
        Test obj = new Test();
        obj.setter(13);
        obj.getter();
    }
    
}
