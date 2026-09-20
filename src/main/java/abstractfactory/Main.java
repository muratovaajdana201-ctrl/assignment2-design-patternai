package abstractfactory;

public class Main {

    public static void main(String[] args) {

        MusicFamilyFactory factory =
                new ClassicalMusicFactory();

        MusicStudio studio =
                new MusicStudio(factory);

        studio.prepareMusicSet();
    }
}
