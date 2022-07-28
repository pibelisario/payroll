package aplication;

import com.sun.deploy.net.MessageHeader;
import entities.Employee;
import entities.OutsourcedEmployee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        List<Employee> employers = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Employee #" + (i + 1) + "data: ");
            System.out.print("Outsourced (y/n)? ");
            char resp = in.next().charAt(0);
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Hours: ");
            int hours = in.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = in.nextDouble();
            if (resp == 'y' || resp == 'Y') {
                System.out.print("Additional charge: ");
                double additionalCharge = in.nextDouble();
                employers.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employers.add(new Employee(name, hours, valuePerHour));
            }


        }
        System.out.println();
        System.out.println("PAYMENTS:");

        for (Employee e : employers){
            System.out.println(e);
        }

    }


}
