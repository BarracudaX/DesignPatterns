package command.vendors;

public class CeilingFan {

    public enum CeilingSpeed {
        LOW,MEDIUM,HIGH,OFF
    }

    private CeilingSpeed speed;

    public CeilingFan() {
        this.speed = CeilingSpeed.OFF;
    }

    public void low(){
        speed = CeilingSpeed.LOW;
        System.out.println("Turned the speed of ceiling fan to low");
    }

    public void medium(){
        speed = CeilingSpeed.MEDIUM;
        System.out.println("Turned the speed of ceiling fan to medium");
    }

    public void off(){
        speed = CeilingSpeed.OFF;
        System.out.println("Turned the ceiling fan off.");
    }

    public void high(){
        speed = CeilingSpeed.HIGH;
        System.out.println("Turned the speed of ceiling fan to high");
    }

    public CeilingSpeed getSpeed() {
        return speed;
    }
}
