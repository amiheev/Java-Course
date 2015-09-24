package Lesson7.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Employee {



    private String surname;
    private double salary;
	private int inn;
    private String name;




    public Employee() {}

    public Employee(int inn, String name, String surname, double salary){
        this.inn = inn;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return "INN: " + inn + " name: " + name + " surname: " + surname + " salary: " + salary;
    }


    public static Employee createEmployee(int inn, String name, String surname, double salary){
        if (inn > 0 && salary > 0) {

            return new Employee(inn, name, surname, salary);
        }else return null;
        }








	
}
