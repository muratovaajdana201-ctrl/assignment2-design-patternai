package abstractfactory;

public class ElectricGuitar implements MusicInstrument {

    @Override
    public void play() {
        System.out.println("Playing electric guitar rock music.");
    }
}