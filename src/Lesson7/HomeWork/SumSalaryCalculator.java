package Lesson7.HomeWork;


public class SumSalaryCalculator implements Payable{
    @Override
    public double sumSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++){
            sum += employees[i].getSalary();
        }
        return sum;
    }
}