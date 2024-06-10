/**
 * isInterruptInterrupted
 */
public class isInterruptInterrupted extends Thread {

    public void run() {
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try {

            for (int i = 1; i <= 5; i++) {

                System.out.print(i);
                Thread.sleep(1000);
                System.out.println(Thread.interrupted());
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted :-" + e);
        }
    }

    public static void main(String[] args) {
        isInterruptInterrupted obj = new isInterruptInterrupted();
        obj.start();
        obj.interrupt();
    }
}