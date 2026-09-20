package factorymethod;

public abstract class MusicInstrumentFactory {

    public abstract MusicInstrument createInstrument();

    public void perform() {
        MusicInstrument instrument = createInstrument();
        instrument.play();
    }
}
