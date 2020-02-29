package facade;

public class Test {

    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(),
                new CdPlayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
        facade.watchMovie("Lord Of The Rings.");

        System.out.println("\n\n");

        facade.endMovie();
    }

}
