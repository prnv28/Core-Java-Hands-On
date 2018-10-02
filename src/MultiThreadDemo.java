// Create multiple Threads.
class NewThread2 implements Runnable{
    String name;
    Thread t;

    NewThread2(String threadName){
        name=threadName;
        t=new Thread(this,name);
        System.out.println("New Thread : "+t);
        t.start();
    }

    //This is entry point of thread.
    @Override
    public void run() {
        try {
            for(int i=5;i>0;i--){
                System.out.println(name+" : "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name+" Interrupted.");
            e.printStackTrace();
        }
        System.out.println(name+ " Exiting.");
    }
}
public class MultiThreadDemo {
    public static void main(String [] args){
        new NewThread2("One"); // Start Threads.
        new NewThread2("Two");
        new NewThread2("Three");

        try {
            for(int i=5;i>0;i--){
                // Wait for other threads to end.
                System.out.println("ok");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
            e.printStackTrace();
        }
        System.out.println("Main thread exiting.");
    }
}
