package Lesson7.HomeWork;

import java.util.*;

/**
 * Created by Alexey on 24.09.2015.
 */
public class EmployeeCreator {

    public static List<Employee> employeeList = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int yes = 1;
        int no = 0;
        System.out.println("для добавления нового сотрудника введите 1 / для выхода введите любой символ");
        while (yes == in.nextInt()) {
            employeeCreator(in, yes);
        }
        printEmployee();
        System.out.println("На выдачу зп сотрудникам нужно: " +  totalSallary() + " грн");
        minEmployeeSalary();
        maxEmployeeSalary();
    }



    public static Employee employeeCreator(Scanner in, int yes){
        System.out.println("заполните данные сотрудника");
        System.out.println("---------------------------------------");
        System.out.println("введите ИНН сотрудника");
        int inn = in.nextInt();
        System.out.println("введите фамилию сотрудника");
        String name = in.next();
        System.out.println("введите имя сотрудника");
        String surname = in.next();
        System.out.println("введите зарплату сотрудника");
        double salary = in.nextDouble();
        System.out.println("введите бонус если сотрудник менеджер");
        double bonus = in.nextDouble();
        if (bonus == 0){
            employeeList.add(Employee.createEmployee(inn, name, surname, salary));
            System.out.println("сотрудник успешно добавлен");
            System.out.println("для добавления нового сотрудника введите 1 / для выхода введите любой символ");
            return Employee.createEmployee(inn, name, surname, salary);
        }else employeeList.add(FabrikaManager.createEmployee(inn, name, surname, salary, bonus));
        System.out.println("менеджер успешно добавлен");
        System.out.println("для добавления нового сотрудника введите 1 / для выхода введите любой символ");
        return FabrikaManager.createEmployee(inn, name, surname, salary, bonus);




    }

    public static double totalSallary(){
        double total = 0;
        for (int i = 0; i < employeeList.size(); i++){
            total += employeeList.get(i).getSalary();
        }
        return total;
    }

    public static void printEmployee(){
        for (int i = 0; i < employeeList.size(); i++){
            System.out.println(employeeList.get(i));
        }
    }

    public static void minEmployeeSalary(){
        int index = 0;
        double minSalary = minSalary = employeeList.get(0).getSalary();
        for (int i = 1; i <employeeList.size(); i++){
            if (minSalary > employeeList.get(i).getSalary()){
                minSalary = employeeList.get(i).getSalary();
                index = i;
            }
        }
        System.out.println("Сотрудник с минимальной зп: " + employeeList.get(index));

    }

    public static void maxEmployeeSalary(){
        int index = 0;
        double maxSalary = maxSalary = employeeList.get(0).getSalary();
        for (int i = 1; i < employeeList.size(); i++){
            if (maxSalary < employeeList.get(i).getSalary()){
                maxSalary = employeeList.get(i).getSalary();
                index = i;
            }
        }
        System.out.println("Сотрудник с максимальной зп: " + employeeList.get(index));

    }






}

