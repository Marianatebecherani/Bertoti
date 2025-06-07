
package pattern;

public class Main {
    public static void main(String[] args) {
        DeviceContext context = new DeviceContext();

        Cellphone celular  = new Cellphone("6.1\"", "Snapdragon 888", 4500, 8, true);
        Notebook notebook = new Notebook("15.6\"", "Intel i7", 6000, 16, false);
        Desktop desktop  = new Desktop("27\"", "AMD Ryzen 9", 32, "mini-ITX");
        Tablet tablet   = new Tablet("10.5\"", "Apple A14", 7600, 4, true);

        // Celular
        context.setStrategy(celular);
        context.showDevice();

        // Notebook
        context.setStrategy(notebook);
        context.showDevice();

        // Desktop
        context.setStrategy(desktop);
        context.showDevice();

        // Tablet
        context.setStrategy(tablet);
        context.showDevice();
    }
}