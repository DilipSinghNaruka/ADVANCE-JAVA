/**
 * sleepMethodMultithread
 */
public class sleepMethodMultithread extends Thread {
    public void run(){
        for (int i = 0; i <=5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                    System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        sleepMethodMultithread obj = new sleepMethodMultithread();
        obj.start();
    }

    
}

