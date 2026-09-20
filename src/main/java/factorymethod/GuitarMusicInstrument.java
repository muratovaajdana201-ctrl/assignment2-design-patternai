package factorymethod;

public class GuitarMusicInstrument implements MusicInstrument {

    @Override
    public void play() {
        System.out.println("Playing guitar music.");
    }
}
