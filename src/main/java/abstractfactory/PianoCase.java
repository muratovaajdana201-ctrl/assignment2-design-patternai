package abstractfactory;

public class PianoCase implements InstrumentCase {

    @Override
    public void protect() {
        System.out.println("Protecting the piano with a classical piano case.");
    }
}
