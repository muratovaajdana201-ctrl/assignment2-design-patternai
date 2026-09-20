package abstractfactory;

public class ClassicalPiano implements MusicInstrument {

    @Override
    public void play() {
        System.out.println("Playing classical piano music.");
    }
}
