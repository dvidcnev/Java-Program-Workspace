package Tutorials.F09_12_2022.Objects;

public class Bike {
    int speed, gear;

    //CONSTRUCTOR
    public Bike(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    //METHODS
    public int appBreak(int dec) {
        speed-=dec;
        return speed;
    }
    public int speedUP(int increase) {
        speed+=increase;
        return speed;
    }
    public String info() {
        return "This bike has: " + gear + " gears, and it's speed is: " + speed;
    }

}

