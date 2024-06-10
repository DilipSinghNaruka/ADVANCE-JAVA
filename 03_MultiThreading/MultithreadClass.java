/**
 * Multithread using class
 */
public class MultithreadClass extends Thread  {
    public void run(){
        System.out.println("Thread task Calling.... ");
    }
    public static void main(String[] args) {
        MultithreadClass obj = new MultithreadClass();
        obj.start();
    }


    
}