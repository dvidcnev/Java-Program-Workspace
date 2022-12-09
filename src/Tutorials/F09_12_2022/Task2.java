package Tutorials.F09_12_2022;
import Tutorials.F09_12_2022.Objects.Salary;

public class Task2 {
    public static void main(String[] args) {
        Salary John = new Salary(3,200.5,"John","Devin");
        John.getInfo();

        Salary Rebbeca = new Salary(5,250,"Rebbeca","Houseward");
        Rebbeca.getInfo();
        Rebbeca.raiseSalary(50);
        Rebbeca.getInfo();

        Salary Fark = new Salary(2022,1000,"Fark","Musterracht");
        Fark.getInfo();
        Fark.raiseSalary(5);
        Fark.getInfo();
        Fark.applySeniority(10);
        Fark.getInfo();
    }
}
