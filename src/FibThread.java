import java.util.Scanner;
class Fib{
    int i,j;
    boolean isValue=false;
    Fib(){
        i=0;
        j=1;
        System.out.print(i);
        System.out.print("\t"+j);
    }

    synchronized void fib1(int n){
        while (isValue) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted.");
                e.printStackTrace();
            }
        }
        for(int k=0;k<n/2;k++){
            System.out.print("\t"+(i+j));
            int temp=i+j;
            i=j;
            j=temp;
        }
        isValue=true;

    }
    synchronized void fib2(int n){
        while (!isValue){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted.");
                e.printStackTrace();
            }
        }
        for(int k=n/2;k<n;k++){
            System.out.print("\t"+(i+j));
            int temp=i+j;
            i=j;
            j=temp;
        }
        isValue=false;
    }
}
public class FibThread{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        Fib fib=new Fib();
        fib.fib1(n-2);
        fib.fib2(n-2);
    }

}