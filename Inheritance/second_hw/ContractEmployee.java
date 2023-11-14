package Inheritance.second_hw;

public class ContractEmployee extends Employee implements CalculatePay {
    protected String federalTaxIdmember;
    protected double hourlyRate;
    protected int hoursWorked;
    public ContractEmployee(String employeeId, String name, String federalTaxIdmember){
        super(employeeId, name);
        this.employeeld = employeeId;
        this.federalTaxIdmember = federalTaxIdmember;
    }
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
    
}
