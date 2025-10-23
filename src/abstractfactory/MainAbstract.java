package abstractfactory;

public class MainAbstract {
    public static void main(String[] args) {
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }

        Application app = new Application(factory);
        app.render();
    }
}
