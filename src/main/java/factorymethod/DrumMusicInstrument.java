package factorymethod;

public class DrumMusicInstrument implements MusicInstrument {

    @Override
    public void play() {
        System.out.println("Playing drum music.");
    }
}
