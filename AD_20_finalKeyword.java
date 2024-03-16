// if we createa any final variable, it become constant, we cannot change the value of final variable
// if we create any final method, we cannot override it 
// if we create any final class, we cannont extend it or inherit it









// ----------------------------- final with class and variable -------------------

// final class A{
//     final int a = 10;
//         // a = a + 29;

//     final void print(){
//         System.out.println(a);
//     }

// }

// // public class AD_20_finalKeyword extends A { // its also throw error becouse class A is final 
// public class AD_20_finalKeyword {
//     public static void main(String[] args) {
//          final int a = 10;
//             a = a+10; // it is throw error here just because of final keyword
//             System.out.println(a);
//     }

// }

// ----------------------- Final keyword in Method form -----------------

class A {
    final void print() {
        System.out.println("Class A");
    }

}

class AD_20_finalKeyword extends A {
    // void print() { // it throw error becouse in base class print method is used
    // finalkeyword
    // System.out.println("Class d");
    // }

    public static void main(String[] args) {
        AD_20_finalKeyword obj = new AD_20_finalKeyword();
        obj.print();

    }

}
