package facade;

public class TheaterLights {
    public void on() {
        System.out.println("Theater's lights are on to 100%");
    }

    public void dim(int dimVolume) {
        System.out.println("Theater's lights are dimmed to "+dimVolume+"%");
    }
}
