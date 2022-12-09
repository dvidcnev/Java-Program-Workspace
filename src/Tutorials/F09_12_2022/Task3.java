package Tutorials.F09_12_2022;
import Tutorials.F09_12_2022.Objects.Bike;
import Tutorials.F09_12_2022.Objects.MountainBike;

public class Task3 { //starting inheritance
    public static void main(String[] args) {
        Bike bike = new Bike(80, 15);
        System.out.println(bike.info());
        MountainBike mbike = new MountainBike(80, 15, 30);
        System.out.println(mbike.newInfo());
        mbike.speedUP(10);
        mbike.replaceWheel(50);
        System.out.println(mbike.newInfo());
    }
}
