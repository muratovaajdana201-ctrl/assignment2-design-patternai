package abstractfactory;

public class MusicStudio {

    private final MusicFamilyFactory factory;

    public MusicStudio(MusicFamilyFactory factory) {
        this.factory = factory;
    }

    public void prepareMusicSet() {
        MusicInstrument instrument = factory.createInstrument();
        InstrumentCase instrumentCase = factory.createCase();

        instrument.play();
        instrumentCase.protect();
    }
}
