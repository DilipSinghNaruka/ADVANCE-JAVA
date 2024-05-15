/*
  An Exception is an unwanted or unexpected event, which occurs during the execution of a progarm i.e at run time, that disrupts the normal flow of the program.
  NOTE:- Object is the parent class of all the classes in java
  NOTE:- All the exceptions occur at runtime

  DIFFRENCE BETWEEN CHECKED EXEPTION AND UNCHECKED EXCEPTION
  *CHECKED EXCEPTION / COMPLILE TIME EXCEPTION :-
                    1. checked Exceptions are the exceptions that are checked and handled at compile time.
                    2. The program gives a compilation error if a method throws a checked exception. 
                    3. If some code within a method thows a checked exception, then the method must either handle the exception or it must specify the exception using throws keyword.
                    4. A checked exceptions occur when the chances of failure are too high
                    5. They are direct subclass of Exception class but do not inherit from RuntimeException.
 *UNCKECKED EXCEPTION / RUNTIME EXCEPTION :-
                    1. Unckecked Exceptions are the exceptions that are not checked at compiled time.
                    2. The program commpiles fine because the compiler is not able to check the exception. 
                    3. A method is not forced by compiler to declare the unckecked exceptions thrown by its implementation. Generally, such methods allmost always do not declare them, as well.
                    4. Unchecked exception occurs mostly due to programming mistakes.
                    5. They are direct subclass of RuntimeException class.


    -> Wheneve there is nexception, the method in which exception occurs will create an object and tht object wil store three things;
        1. exception name       2. description          3. stack trace
        Note :- printStackTrace() method is tell those three statements


We can handle the exception using 5 keywords:
    1. try      2. catch        3. finally      4. throw        5. throws
    1, try :- Th4e try, statement allows you to define a block of code to be testeed for errors while it is being executed. 
    2. catch :- The catch statement allows you to define a block of code to be executed, if an error occurs in the try block. 
    3. finally :- finally is the block that is always executed whether exception is handled or not   
                -> we can use multiple catch blocks with one try block but we can only use single finally block with one try block, not multiple
                -> The statements present in the finally block execure even if the try block contains control transfer statemtents (i.e jump statemtns) like return break or continue
                -> THE Possibilities that disturbs the execution of finally block are Case 
                        Case 1:- Using of the System.exit() method.
                        Case 2:- Causing a fatal error that causes the process to abort
                        Case 3:- Due to an exception arising in the finally block
                        Case 4: The death of a Thread
    4. throw :- -> use for custom exceptions 
                -> user defined exception
    5. throws :-


NOTE:- final :- keyword, use with variable, mothod, class
       finally:- Block,use with either try or try-catch block
       finalize :- Method, Method si override for an object    
 
 */

// here i'm using olny try & catch 
// public class AD_23_ExeptionHanding {
//     public static void main(String args[]){
//         int a = 100;
//         int b = 0;
//         //int c = a/0; // here compiler throws this error if we are not using exception handing -->
//                        // Exception in thread "main" java.lang.ArithmeticException: / by zero
//         try{
//             int c = a/b;
//             System.out.println("jai siyaram"); // this statement is not print becaouse uper is given a error so compiler goes in catch  
//             System.out.println(c);
//         }catch(Exception  e){
//             e.printStackTrace();
//             // System.out.println(e);
//             // System.out.println("jai shree ram");
//         }

//     }

// }

// IN this i'm using Finally keyword 
// public class AD_23_ExeptionHanding {
//     public static void main(String args[]) {
//         int a = 100;
//         int b = 0;
//         try {
//             int c = a / b;
//             System.out.println(c);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }finally{
//             System.out.println("this is finally block");      // in the finally block write clean-up code,   its mean if in problem or not finally block always run at the end
//         }

//     }

// }

// IN this i'm using throw keyword 
public class AD_23_ExeptionHanding {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String args[]) {
        // int a = 100;
        // int b = 0;
        // try {
        // int c = a / b;
        // System.out.println(c);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }finally{
        // System.out.println("this is finally block"); // in the finally block write
        // clean-up code, its mean if in problem or not finally block always run at the
        // end
        // }
        checkAge(13);
        System.out.println("jai shree ram");

    }

}
