class prime1{
    int id =0;
    synchronized public void getTurn(int id_1,int n,int m){
        try {

            if(this.id!=id_1) {wait();}

            for(int i=n;i<m;i++){
                boolean flag=false;
                for(int j=2;j<Math.sqrt(i);j++){
                    if(i%j==0)
                    {
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    System.out.print("\t"+i);
                }
            }
            id++;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class calPrime extends Thread{
    prime1 p;
    int i;
    int n;
    int m;
    calPrime(String name,prime1 ref, int i,int n,int m){
        super(name);
        p = ref;
        this.i = i;
        this.n=n;
        this.m=m;
        this.start();
    }
    public void run(){
        try {
            p.getTurn(i,n,m);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("IE");
        }
    }
}

public class Prime {
    public static void main(String []args){
        prime1 c = new prime1();
        calPrime f1 = new calPrime("c1",c,0,2,10);
        calPrime f2 = new calPrime("c2",c,1,11,20);
        calPrime f3 = new calPrime("c3",c,2,21,30);
        try{
            f1.join();
            f2.join();
            f3.join();
        }
        catch(InterruptedException e){
            System.out.println("IE");
        }
    }
}
