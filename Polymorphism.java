package javaapplication1;

class Employee {

    double yearlyIncome;
    double bonus;
    double taxRate;
    double salary;

    void BonusCalculate() {
        System.out.println("Bonus created");
    }
}

class Manager extends Employee {

    Manager() {
        super.bonus = 0.1;
        super.yearlyIncome = 1200.00;
        // super.taxRate=.1;
        super.salary = yearlyIncome / 12;
    }

    @Override
    void BonusCalculate() {
        double calculateBonus = super.salary * super.bonus;
        super.salary = super.salary + calculateBonus;
        System.out.println("Bonus=" + calculateBonus);
        System.out.println("Current Salary= " + super.salary);

    }

    void taxCalculate() {
        if (super.yearlyIncome<=200000) {
            System.out.println("No tax Needed");  
        }else if (super.yearlyIncome>=200000 && super.yearlyIncome <500000){
            double tax = super.yearlyIncome*0.1;
            System.out.println("Tax is: "+tax);
        }else if(super.yearlyIncome>=500000 && super.yearlyIncome <1000000){
            double tax = super.yearlyIncome*0.15;
            System.out.println("Tax is: "+tax);
        }
    }

}

public class Polymorphism {

    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.BonusCalculate();
        m1.taxCalculate();
    }

}
