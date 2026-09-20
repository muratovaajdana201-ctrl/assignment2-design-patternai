package abstractfactory;

public class GuitarCase implements InstrumentCase {

    @Override
    public void protect() {
        System.out.println("Protecting the electric guitar with a guitar case.");
    }
}