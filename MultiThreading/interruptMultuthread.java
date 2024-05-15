public class interruptMultuthread extends Thread {
    public  void run(){
        try {
            
            for (int i = 1; i <=5; i++) {
                
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted :-"+e);
        }
    }
    public static void main(String[] args) {
        interruptMultuthread obj = new interruptMultuthread();
        obj.start();
        obj.interrupt();
    }
}
