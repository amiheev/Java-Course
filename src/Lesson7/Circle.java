package Lesson7;

/**
 * Created by Alexey on 21.09.2015.
 */
public class Circle extends Shape {
    private double radius;
    double p = Math.PI;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static Circle createCircle(double radius){
        if (radius > 0){
            return new Circle(radius);
        }else return null;

    }

    public double getCirclePerimetr(){
        return this.getRadius() * p * 2;
    }

    public double getCircleArea(){
        return (this.getRadius() * this.getRadius()) * p;
    }

    public String toString(){
        return "radius -" + getRadius() + " perimetr " + getCirclePerimetr() + " area " + getCircleArea();
    }

    public static void main(String[] args){
        System.out.println(createCircle(5).toString());
    }
}
