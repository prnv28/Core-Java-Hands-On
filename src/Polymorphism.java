abstract class shape{
    int d1,d2;

    shape(int d_d1,int d_d2){
        d1=d_d1;
        d2=d_d2;
    }

    abstract float calculateArea();
}

class Rectangle extends shape{
    float area;
    Rectangle(int n1,int n2){
        super(n1,n2);
    }

    @Override
    float calculateArea() {
        area=(float) d1*d2;
        return area;
    }
}

class Triangle extends shape{
    float area;

    Triangle(int n1,int n2){
        super(n1,n2);
    }

    @Override
    float calculateArea() {
        area= (float) (0.5*d1*d2);
        return area;
    }
}

public class Polymorphism{
    public static void main(String [] args){
        shape s=new Rectangle(5,2);
        System.out.println("Area of Rectangle is : "+s.calculateArea());
        s=new Triangle(6,2);
        System.out.println("Area of Triangle is : "+s.calculateArea());
    }
}