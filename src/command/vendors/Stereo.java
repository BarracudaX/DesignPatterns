package command.vendors;

public class Stereo {

    public void off() {
        System.out.println("Stereo is off.");
    }

    public void on() {
        System.out.println("Stereo is on.");
    }

    public void setCd() {
        System.out.println("The cd is set.");
    }

    public void setVolume(int volume) {
        System.out.println("Volume is set to "+volume);
    }
}
