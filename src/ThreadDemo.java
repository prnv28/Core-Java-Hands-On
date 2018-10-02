//create a second thread.
class NewThread implements Runnable{
    Thread t;
    NewThread(){
        // create a new, second Thread.
        t=new Thread(this,"Demo Thread");
        System.out.println("Child Thread : "+t);
        t.start(); // Start the thread.
    }

    // this is entry point for the second thread.
    @Override
    public void run() {
        try {
            for (int i=5;i>0;i--){
                System.out.println("Child Thread : "+t);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted.");
            e.printStackTrace();
        }
        System.out.println("Exiting child thread.");
    }
}
public class ThreadDemo {
    public static void main(String [] args){
        new NewThread(); // creat new thread.

        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread : "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
            e.printStackTrace();
        }
        System.out.println("Main Thread exiting.");
    }
}
