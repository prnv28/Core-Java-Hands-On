import java.util.Scanner;

public class Factorial {
    private int number; // private member variable of class Factorial

    public Factorial(int n){  // public constuctor method
        number = n;
    }

    public int getNumber(){   // public method which returns private variable's value
        return number;
    }

    public int factRecursive(int n){ // Recursive implementation of factorial function
        if(n<=1) {
            return 1;
        }
        else{
            return (n*factRecursive(n-1));
        }
    }

    public int factItterative(int n){ // Iterrative implementation of factorial function
        if(n<=1){
            return 1;
        }
        else{
            int sum=1;
            for(int i=n;i>=1;i--){
                sum*=i;
            }
            return sum;
        }
    }

    public static void main(String [] args){  // Main driver function
        int resultRec, resultItr;
        Factorial n;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number : ");
        n=new Factorial(sc.nextInt());

        resultRec=n.factRecursive(n.getNumber());
        resultItr=n.factItterative(n.getNumber());

        System.out.println("Result (Recursion) : "+ resultRec);
        System.out.println("Result (Iterration) : "+ resultItr);
    }

}
