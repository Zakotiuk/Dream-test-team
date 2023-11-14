package Inheritance.second_hw;

public class SalariedEmployee extends Employee implements CalculatePay{
    protected String socialSecurityNumber;
    protected double fixedMonthlyPayment;
    public SalariedEmployee(String employeeld, String name, String socialSecurityNumber, double fixedMonthlyPayment){
        super(employeeld, name);
        this.employeeld = employeeld;
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
    
}
