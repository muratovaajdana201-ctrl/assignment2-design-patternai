package factorymethod;

public class GuitarMusicInstrumentFactory extends MusicInstrumentFactory {

    @Override
    public MusicInstrument createInstrument() {
        return new GuitarMusicInstrument();
    }
}
