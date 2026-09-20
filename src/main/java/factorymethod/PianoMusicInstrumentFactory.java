package factorymethod;

public class PianoMusicInstrumentFactory extends MusicInstrumentFactory {

    @Override
    public MusicInstrument createInstrument() {
        return new PianoMusicInstrument();
    }
}