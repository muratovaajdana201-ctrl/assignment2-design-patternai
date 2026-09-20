package factorymethod;

public class PianoMusicInstrument implements MusicInstrument {

    @Override
    public void play() {
        System.out.println("Playing piano music.");
    }
}