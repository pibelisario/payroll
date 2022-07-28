package entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee(){

    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + 1.10 * additionalCharge;
    }

    @Override
    public String toString(){
         return super.getName() + " - $ " + String.format("%.2f", payment());
    }


}
