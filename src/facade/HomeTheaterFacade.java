package facade;

public class HomeTheaterFacade {

    private final Amplifier amplifier;

    private final Tuner tuner;

    private final DvdPlayer dvdPlayer;

    private final CdPlayer cdPlayer;;

    private final Projector projector;

    private final TheaterLights lights;

    private final Screen screen;

    private final PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector,
                             TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");

        popper.on();
        popper.pop();

        lights.dim(10);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");

        popper.off();

        lights.on();

        screen.up();

        projector.off();

        amplifier.off();

        dvdPlayer.stop();

        dvdPlayer.eject();

        dvdPlayer.off();
    }

}
