class A1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread A : "+i);
        }
    }
}
class B1 extends Thread{
    public void run(){
        for(int j=0;j<=10;j++){
            System.out.println("Thread B : "+j);
        }
    }
}
public class thread1{
    public static void main(String [] args){
        A1 o1=new A1();
        B1 o2=new B1();
        o1.start();
        o2.start();
    }
}
