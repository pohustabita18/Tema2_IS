package abstractfactory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows button");
    }
}

