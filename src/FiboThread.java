class Fibo{
    int id;
    int m=0,n=1,s;
    synchronized void getTurn(int Id){
        try {
            if(this.id!=Id){
                wait();
            }
            for(int i=0;i<10;i++){
                System.out.print("\t"+(m+n));
                int temp=m+n;
                m=n;
                n=temp;
            }
            id++;
            notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class calFibo extends Thread{
    int id;
    Fibo f;
    calFibo(Fibo F,int Id){
        id=Id;
        f=F;
        this.start();
    }

    public void run(){
        try {
            f.getTurn(this.id);
            this.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class FiboThread {
    public static void main(String[] args) {
        Fibo fib = new Fibo();
        calFibo f1 = new calFibo(fib, 0);
        calFibo f2 = new calFibo(fib, 1);
        calFibo f3 = new calFibo(fib, 3);
        System.out.print("0");
        System.out.print("\t"+"1");
        try {
            f1.join();
            f2.join();
            f3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
