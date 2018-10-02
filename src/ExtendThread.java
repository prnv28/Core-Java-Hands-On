// Create the second thread by extending Thread.
class NewThread1 extends Thread{

    NewThread1(){
        // create new ,second thread.
        super("Demo Thread");
        System.out.println("Child Thread : "+this);
        start(); // start the thread.
    }
    // This is the entry point for the second thread.

    // This is the entry point of the new thread.
    public void run(){
        try {
            for(int i=5;i>0;i--){
                System.out.println("Child Thread : "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted.");
            e.printStackTrace();
        }
        System.out.println("Exiting child thread.");
    }

}
public class ExtendThread {
    public static void main(String []args){
        new NewThread1(); // create a new thread.

        try {
            for(int i=5;i>0;i--){
                System.out.println("Main Thread : "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
            e.printStackTrace();
        }
        System.out.println("Exiting Main Thread.");
    }
}
