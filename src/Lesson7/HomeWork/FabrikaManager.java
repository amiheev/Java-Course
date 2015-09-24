package Lesson7.HomeWork;

/**
 * Created by Alexey on 24.09.2015.
 */
public class FabrikaManager extends Employee {
    private double bonus;

    public double getSalary() {
        return bonus + super.getSalary();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public FabrikaManager() {
    }

    public FabrikaManager(double bonus, int inn, String name, String surname, double salary) {
        super(inn,name,surname,salary);
        this.bonus = bonus;

    }


    public static FabrikaManager createEmployee(int inn, String name, String surname, double salary, double bonus){
        return new FabrikaManager(bonus,inn,surname,name,salary);

    }

    public String toString(){
        return super.toString() + " (bonus " + bonus + ")";
    }
}
