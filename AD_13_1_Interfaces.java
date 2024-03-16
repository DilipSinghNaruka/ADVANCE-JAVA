// Interfaces are similar to Abstract class but having all the methods of abstract type.
// Interface are the blueprint of the class it specify what a class must do and not how.
 // Note:- It supports multiple Inheritance in java
 // it can be used to achieve loose coupling(not change in both class)

interface Test{
    public void show();
}
interface Test2{
    public void show2();
}
public class AD_13_1_Interfaces implements Test,Test2 {
    public void show(){  // public accessifier is most import here because in parend class function have public accessifier
        System.out.println("Interface using Test");
    }
    public void show2(){  // public accessifier is most import here because in parend class function have public accessifier
        System.out.println("Interface using Test2");
    }
    public static void main(String[] args) {
        AD_13_1_Interfaces obj = new AD_13_1_Interfaces();
        obj.show();
        obj.show2();
    }
}
