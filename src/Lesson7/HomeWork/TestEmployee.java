package Lesson7.HomeWork;

/**
 * Created by Alexey on 28.09.2015.
 */
public class TestEmployee {
    public static void main(String[] args){
        SumSalaryCalculator sumSalaryCalculator = new SumSalaryCalculator();
        int yes = 1;
        int no = 0;
        for (int i = 0; i < EmployeeCreatorArray.employeeList.length; i++){
            EmployeeCreatorArray.employeeCreator();
            EmployeeCreatorArray.counter++;
        }
        ReportCreator.printEmployee(EmployeeCreatorArray.employeeList);
        ReportCreator.maxEmployeeSalary(EmployeeCreatorArray.employeeList);
        ReportCreator.minEmployeeSalary(EmployeeCreatorArray.employeeList);
        System.out.println("Нужно всего на выдачу зарплат " + sumSalaryCalculator.sumSalary(EmployeeCreatorArray.employeeList));

    }
}
