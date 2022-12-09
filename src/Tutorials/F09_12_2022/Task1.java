package Tutorials.F09_12_2022;
import Tutorials.F09_12_2022.Objects.OOP1;

public class Task1 {
    public static void main(String[] args) {
        OOP1 circle1 = new OOP1();
        System.out.println(circle1.info());
        OOP1 c2 = new OOP1(5, "Yellow");
        System.out.println(c2.info());
        c2.setRadius(20);
        System.out.println(c2.info());
    }
}
