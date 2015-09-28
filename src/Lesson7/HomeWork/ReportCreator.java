package Lesson7.HomeWork;

/**
 * Created by Alexey on 28.09.2015.
 */
public class ReportCreator {

    public static double totalSallary(Employee[] employeeList){
        double total = 0;
        for (int i = 0; i < employeeList.length; i++){
            total += employeeList[i].getSalary();
        }
        return total;
    }

    public static void printEmployee(Employee[] employeeList){
        for (int i = 0; i < employeeList.length; i++){
            System.out.println(employeeList[i]);
        }
    }

    public static void minEmployeeSalary(Employee[] employeeList){
        int index = 0;
        double minSalary  = employeeList[0].getSalary();
        for (int i = 1; i <employeeList.length; i++){
            if (minSalary > employeeList[i].getSalary()){
                minSalary = employeeList[i].getSalary();
                index = i;
            }
        }
        System.out.println("Сотрудник с минимальной зп: " + employeeList[index]);

    }

    public static void maxEmployeeSalary(Employee[] employeeList){
        int index = 0;
        double maxSalary = employeeList[0].getSalary();
        for (int i = 1; i < employeeList.length; i++){
            if (maxSalary < employeeList[i].getSalary()){
                maxSalary = employeeList[i].getSalary();
                index = i;
            }
        }
        System.out.println("Сотрудник с максимальной зп: " + employeeList[index]);

    }


    // Сортировка по зарплате
    public static void sortSalary(Employee[] employeeList){
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
    public static void sortName(Employee[] employeeList){
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
    public static void sortSurname(Employee[] employeeList){
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
    public static void sortByInn(Employee[] employeeList){
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
