package aplication;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

    public static void main(String[] args) {

        Employee e = new Employee("Alex", 60, 20.00);
        System.out.println(e.payment());

        OutsourcedEmployee o = new OutsourcedEmployee("Bob",100,15.0);
        System.out.println(o.additionalCharge(200.0));

    }


}
