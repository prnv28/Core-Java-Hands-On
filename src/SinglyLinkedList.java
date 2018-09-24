import java.util.Scanner;

class node{
    int i;
    node next;
    node(){
        i=0;
        next=null;
    }
    node(int d_i){
        i=d_i;
        next=null;
    }
    void append(node new_node){
        node temp=this;
        while (temp.next != null){
            temp=temp.next;
        }
        temp.next=new_node;
    }
    void display(){
        node temp=this;
        while (temp.next != null){
            System.out.print(" "+temp.i+"->");
            temp=temp.next;
        }
        System.out.print(" "+temp.i+"-> NULL");
    }
}

public class SinglyLinkedList {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int ch,m,temp,i=1;
        node n;
        System.out.print("Enter First Node : ");
        node first=new node(sc.nextInt());
        while (i!=0){
            System.out.println("\n********Singly Linked List*********");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.println("********Singly Linked List*********");
            System.out.print("\nEnter Your Choice :");

            ch=sc.nextInt();
            switch(ch){
                case 1:System.out.print("Enter Data : ");
                        n=new node(sc.nextInt());
                        first.append(n);
                        break;
                case 2:first.display();
                        break;
                case 3:i=0;
                        break;
                default:System.out.println("Please Enter Valid Choice (1<=choice<=3) !!!");
            }
        }
    }
}
