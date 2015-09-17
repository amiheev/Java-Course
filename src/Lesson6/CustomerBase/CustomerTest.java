package Lesson6.CustomerBase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Alexey on 16.09.2015.
 */
public class CustomerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int yes = 1;
        int no = 0;
        System.out.println("Welcome to Customer DataBase");
        System.out.println("for adding new customer input 1, for showing all customers and exit input 0");
        customerCreation(in, yes);
        if (Customer.customerList.size() > 0) {
            System.out.println("Customers count is :  " + Customer.customerList.size());
            for (int i = 0; i < Customer.customerList.size(); i++){
                System.out.println(" " + Customer.customerList.get(i));
            }
        }else System.out.println(" ----------------- Client list blank ---------------- ");
    }

    private static void customerCreation(Scanner in, int yes) {
        try {
            while (yes == in.nextInt()) {
            Customer customer = new Customer();
                System.out.println("input Customer name ");
                customer.setName(in.next());
                System.out.println("input Customer surname ");
                customer.setSurname(in.next());
                System.out.println("input Customer card number ");
                customer.setCardNumber(in.next());
                System.out.println("input Customer bill number");
                customer.setAccountNumber(in.nextLong());
                System.out.println("input customer city");
                customer.address.setCity(in.next());
                System.out.println("input customer street");
                customer.address.setStreet(in.next());
                System.out.println("input customer house ");
                customer.address.setHouseNumber(in.nextInt());
                System.out.println("input customer flat");
                customer.address.setFlatNumber(in.nextInt());
                Customer.customerList.add(customer);
                System.out.println(" ---------------- Customer was successfully added ---------------- ");
                customer.setId(customer.getId() + 1);
                System.out.println("for adding new customer input 1, for showing all customers and exit input 0");
            }
        }catch (InputMismatchException e){
                System.err.println("Incorrect data type was input program will be closed");

        }

    }
}

    /*    if (Customer.customerList.size() > 0) {
        System.out.println(Customer.customerList);
        } else {
        System.out.println("Список клиентов пуст ");
        }*/