package Lesson7.HomeWork;

import java.util.*;

/**
 * Created by Alexey on 24.09.2015.
 */
public class EmployeeCreatorArray {

    static Employee employeeList [] = new Employee[3];
    static Scanner in = new Scanner(System.in);
    static int counter = 0;
    public static void main(String[] args){
        int yes = 1;
        int no = 0;
        for (int i = 0; i < employeeList.length; i++){
            employeeCreator();
            counter++;
        }
        System.out.println("----Информация о сотрудниках----");
        printEmployee();
        System.out.println("На выдачу зп сотрудникам нужно: " +  totalSallary() + " грн");
        minEmployeeSalary();
        maxEmployeeSalary();
    }



    public static Employee employeeCreator(){
        System.out.println("заполните данные сотрудника");
        System.out.println("---------------------------------------");
        System.out.println("введите ИНН сотрудника");
        int inn = in.nextInt();
        System.out.println("введите фамилию сотрудника");
        String surname = in.next();
        System.out.println("введите имя сотрудника");
        String name = in.next();
        System.out.println("введите зарплату сотрудника");
        double salary = in.nextDouble();
        System.out.println("введите бонус если сотрудник менеджер");
        double bonus = in.nextDouble();
        if (bonus == 0){
            employeeList[counter] = (Employee.createEmployee(inn, name, surname, salary));
            System.out.println("сотрудник успешно добавлен");
            return Employee.createEmployee(inn, name, surname, salary);
        }else employeeList[counter] = (FabrikaManager.createEmployee(inn, name, surname, salary, bonus));
        System.out.println("менеджер успешно добавлен");
        return FabrikaManager.createEmployee(inn, name, surname, salary, bonus);




    }

    public static double totalSallary(){
        double total = 0;
        for (int i = 0; i < employeeList.length; i++){
            total += employeeList[i].getSalary();
        }
        return total;
    }

    public static void printEmployee(){
        for (int i = 0; i < employeeList.length; i++){
            System.out.println(employeeList[i]);
        }
    }

    public static void minEmployeeSalary(){
        int index = 0;
        double minSalary = minSalary = employeeList[0].getSalary();
        for (int i = 1; i <employeeList.length; i++){
            if (minSalary > employeeList[i].getSalary()){
                minSalary = employeeList[i].getSalary();
                index = i;
            }
        }
        System.out.println("Сотрудник с минимальной зп: " + employeeList[index]);

    }

    public static void maxEmployeeSalary(){
        int index = 0;
        double maxSalary = maxSalary = employeeList[0].getSalary();
        for (int i = 1; i < employeeList.length; i++){
            if (maxSalary < employeeList[i].getSalary()){
                maxSalary = employeeList[i].getSalary();
                index = i;
            }
        }
        System.out.println("Сотрудник с максимальной зп: " + employeeList[index]);

    }


    // Сортировка по зарплате
    public static void sortSalary(){
        for (int i = 0; i < employeeList.length-1; i++){
            for (int j = i+1; j < employeeList.length; j++){
                if (employeeList[i].getSalary()<employeeList[j].getSalary()){
                    Employee swap = employeeList[i];
                    employeeList[i] = employeeList[j];
                    employeeList[j]=swap;
                }
            }
        }
    }


    // Сортировка по имени
    public static void sortName(){
        for (int i = 0; i < employeeList.length-1; i++){
            for (int j = i+1; j < employeeList.length; j++){
                if (employeeList[i].getName().compareToIgnoreCase(employeeList[j].getName()) > 0){
                    Employee swap = employeeList[i];
                    employeeList[i] = employeeList[j];
                    employeeList[j]=swap;
                }

            }
        }
    }


    // Сортировка по фамилии
    public static void sortSurname(){
        for (int i = 0; i < employeeList.length-1; i++){
            for (int j = i+1; j < employeeList.length; j++){
                if (employeeList[i].getSurname().compareToIgnoreCase(employeeList[j].getSurname()) > 0){
                    Employee swap = employeeList[i];
                    employeeList[i] = employeeList[j];
                    employeeList[j]=swap;
                }

            }
        }
    }


    // Сортировка по номеру ИНН
    public static void sortByInn(){
        for (int i = 0; i < employeeList.length-1; i++){
            for (int j = i+1; j < employeeList.length; j++){
                if (employeeList[i].getInn()<employeeList[j].getInn()){
                    Employee swap = employeeList[i];
                    employeeList[i] = employeeList[j];
                    employeeList[j]=swap;
                }
            }
        }
    }
}

