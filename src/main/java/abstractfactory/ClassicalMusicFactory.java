package abstractfactory;

public class ClassicalMusicFactory implements MusicFamilyFactory {

    @Override
    public MusicInstrument createInstrument() {
        return new ClassicalPiano();
    }

    @Override
    public InstrumentCase createCase() {
        return new PianoCase();
    }
}
