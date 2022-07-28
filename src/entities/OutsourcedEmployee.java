package entities;

public class OutsourcedEmployee extends Employee{



    public OutsourcedEmployee(){}

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);

    }

    public double additionalCharge(double amount){
        return super.payment() + 1.10 * amount;

    }
}
