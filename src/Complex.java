import java.util.Scanner;

public class Complex {

    private int r;
    private int i;

    public Complex(int a, int b){
        r=a;
        i=b;
    }

    public int getR(){
        return r;
    }

    public int getI(){
        return i;
    }

    public void addition(Complex c1, Complex c2){
        r=c1.r+c2.r;
        i=c1.i+c2.i;
    }

    public static void main(String [] args) {
        Complex c1, c2, c3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        c1 = new Complex(sc.nextInt(), sc.nextInt());

        System.out.println("Enter second number : ");
        c2 = new Complex(sc.nextInt(), sc.nextInt());

        c3 = new Complex(0, 0);
        c3.addition(c1, c2);

        System.out.println("Result (Addition) : (" + c3.getR() + ") + (" + c3.getI() + "i)");
    }
}
