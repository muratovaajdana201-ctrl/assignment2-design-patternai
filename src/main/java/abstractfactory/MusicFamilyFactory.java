package abstractfactory;

public interface MusicFamilyFactory {

    MusicInstrument createInstrument();

    InstrumentCase createCase();
}