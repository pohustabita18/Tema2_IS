package factorymethod;

public class MainFactory {
    public static void main(String[] args) {
        Application app1 = new WordApplication();
        app1.openDocument();

        Application app2 = new PdfApplication();
        app2.openDocument();
    }
}
