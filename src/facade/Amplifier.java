package facade;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier is on.");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("The dvd of the amplifier is set.");
    }

    public void setSurroundSound() {
        System.out.println("Surround sound of the amplifier is on.");
    }

    public void setVolume(int volume) {
        System.out.println("The volume of the amplifier is set to "+volume);
    }

    public void off() {
        System.out.println("Amplifier is off.");
    }
}
