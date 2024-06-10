// create Multithreading using interface 

class MultithreadInterface implements Runnable{

    public void run(){
        System.out.println("interface is running... ");
    }
    public static void main(String []args){
        MultithreadInterface obj = new MultithreadInterface();
        Thread th = new Thread(obj);
        th.start();
    }
}
