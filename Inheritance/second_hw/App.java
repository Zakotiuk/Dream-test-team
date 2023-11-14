package Inheritance.second_hw;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
            new ContractEmployee("220022", "Andrey", "1bf11j"),
            new SalariedEmployee("223300", "Oleg", "6gnnv1", 2040),
            new ContractEmployee("522300", "Viktoriia", "86ghd5"),
            new SalariedEmployee("267200", "Anna", "9vbgnf1", 1200),
        };

        Arrays.sort(employees, (e1, e2) -> {
            double wage1 = ((CalculatePay)e2).calculatePay();
            double wage2 = ((CalculatePay)e1).calculatePay();
            return Double.compare(wage1, wage2);
        });

        for(int i = 0; i < 3; ++i){
            System.err.println(employees[i].name + " has ID: " + employees[i].employeeld + " has salary " + ((CalculatePay)employees[i]).calculatePay());
        }
    }
}
