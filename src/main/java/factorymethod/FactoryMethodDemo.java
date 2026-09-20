package factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        MusicInstrumentFactory pianoFactory =
                new PianoMusicInstrumentFactory();

        MusicInstrumentFactory guitarFactory =
                new GuitarMusicInstrumentFactory();

        MusicInstrumentFactory drumFactory =
                new DrumMusicInstrumentFactory();

        pianoFactory.perform();
        guitarFactory.perform();
        drumFactory.perform();
    }
}
