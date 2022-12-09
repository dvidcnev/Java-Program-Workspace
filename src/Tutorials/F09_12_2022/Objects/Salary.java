package Tutorials.F09_12_2022.Objects;

public class Salary {
    private int ID;
    private double msalary;
    private String name;
    private String lastname;

    public Salary() {
        ID = 0;
        msalary=100;
        name = "Employer";
        lastname = "Example";
    }

    public Salary(int ID, double msalary, String name, String lastname) {
        this.ID = ID;
        this.msalary = msalary;
        this.name = name;
        this.lastname = lastname;
    }

    //GETTERS
    public int getID() {
        return ID;
    }

    public double getMsalary() {
        return msalary;
    }

    public String getNameLastname() {
        String s = name + " " + lastname;
        return s;
    }
    public double getYearSalary() {
        return msalary*12;
    }

    //METHODS
    public void raiseSalary(double percent) {
        msalary = (1+percent/100)*msalary;
    }
    public void applySeniority(int year) {
        msalary+=year*0.33/100*msalary;
    }
    public void getInfo() {
        System.out.println("ID: " + getID() + " \t| NAME/LASTNAME: " + getNameLastname() + "\t| MONTHLY SALARY: " + getMsalary());
    }



}
