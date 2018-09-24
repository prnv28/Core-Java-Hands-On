import java.util.Scanner;

import static java.lang.System.*;

public class Stack1 {

    private int top;
    private int maxSize;
    private long [] stackArray;

    public Stack1(int s){
        maxSize=s;
        stackArray=new long[maxSize];
        top=-1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public void push(long p){
        if(!isFull()){
            stackArray[++top]=p;
        }
        else {
            System.out.println("Stack is Full!!!");
        }
    }

    public long pop(){
        if(!isEmpty()){
            return stackArray[top--];
        }
        else{
            out.println("Stack is Empty!!!");
            return 1;
        }
    }

    public void top(){
        if(!isEmpty())
        {
            System.out.println(stackArray[top]);
        }
        else{
            out.println("Stack is Empty!!!");
        }
    }

    public void display(){
        if(!isEmpty()){
            for(int i=top;i>-1;i--){
                out.println("|"+stackArray[i]+"|");
            }
        }
        else{
            out.println("Stack is empty!!!");
        }
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(in);

        out.print("Enter Size of Stack : ");
        Stack1 s=new Stack1(sc.nextInt());

        int out=1;
        while(out==1){
            System.out.println("**********Stack*********");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("**********Stack*********");
            System.out.println("\n");
            System.out.print("Enter your choice : ");
            int key=sc.nextInt();
            switch (key){
                case 1: System.out.print("Enter The number : ");
                        int p=sc.nextInt();
                        s.push(p);
                        break;

                case 2: s.pop();
                        break;

                case 4: s.display();
                        break;

                case 3:s.top();
                        break;

                case 5:out=0;
                        break;

                 default:System.out.println("Pleasse Enter valid Choice (1<= Choice <=5) ");
                        break;

            }
        }
    }
}
