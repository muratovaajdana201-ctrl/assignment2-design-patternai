package factorymethod;

public class DrumMusicInstrumentFactory extends MusicInstrumentFactory {

    @Override
    public MusicInstrument createInstrument() {
        return new DrumMusicInstrument();
    }
}
