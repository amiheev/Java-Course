package Lesson7;

/**
 * Created by Alexey on 21.09.2015.
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    private Triangle() {}
    private Triangle(double a,double b, double c){
        this.setA(a);
        this.setB(b);
        this.setC(c);
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;

    }

    public static Triangle createTriangle(double a, double b, double c){
        if (a + b > c && a + c > b && b +c > a){
            return new Triangle(a,b,c);
        }else if (a<=0 || b<=0 || c<=0){
            return null;
        }else return null;
    }

    public double getTriangleP(){
        return this.getA() + this.getB() + this.getC();
    }

    public double getTriangleArea(){
        double semiTriangleP = getTriangleP() / 2;
        return Math.sqrt(semiTriangleP * (semiTriangleP-a) * (semiTriangleP -b) * (semiTriangleP -c));
    }



    public String toString(){
        return "a " + getA() + " b " + getB() + " c " + getC() + ", Perimetr " + getTriangleP() + " , Area " + getTriangleArea() ;
    }

    public static void main(String[] args){
        System.out.println(createTriangle(3.2, 3.3, 3.4).toString());


    }
}
