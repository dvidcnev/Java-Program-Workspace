package Tutorials.F09_12_2022.Objects;

public class MountainBike extends Bike {
    int wheelsize;

    //CONSTRUCTOR
    public MountainBike(int speed, int gear, int wheelsize) {
        super(speed, gear);
        this.wheelsize = wheelsize;
    }

    public int replaceWheel(int wheelsize) {
        speed += 0.25 * wheelsize;
        return speed;
    }

    public String newInfo() {
        return super.info() + " and wheel size is " + wheelsize;
    }


}
