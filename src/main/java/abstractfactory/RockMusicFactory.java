package abstractfactory;

public class RockMusicFactory implements MusicFamilyFactory {

    @Override
    public MusicInstrument createInstrument() {
        return new ElectricGuitar();
    }

    @Override
    public InstrumentCase createCase() {
        return new GuitarCase();
    }
}