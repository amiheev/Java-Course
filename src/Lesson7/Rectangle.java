package Lesson7;

/**
 * Created by Alexey on 21.09.2015.
 */
public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(){}

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public static Rectangle createRectangle(double a, double b){
        if (a != b){
            return new Rectangle(a,b);
        }else if (a<=0 || b<=0){
            return null;
        }else return null;
    }

    public double getRectangleArea(){
        return this.getA() * this.getB();
    }
    public double getRectangleP(){
        return (this.getA() + this.getB()) * 2;
    }

    public String toString(){
        return "a -" + getA() + " b- " + getB() +  ", perimetr " + getRectangleP() + " area " + getRectangleArea()  ;
    }

    public static void  main(String [] args){
        System.out.println(createRectangle(2.2, 5.6).toString());
    }
}
