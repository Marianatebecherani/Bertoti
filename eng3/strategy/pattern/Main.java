
package pattern;

public class Main {
    public static void main(String[] args) {
        DeviceContext context = new DeviceContext();

        Device celular  = new Device("6.1\"",  "Snapdragon 888", 4500,  8);
        Device notebook = new Device("15.6\"", "Intel i7",       6000, 16);
        Device desktop  = new Device("27\"",   "AMD Ryzen 9",      0,  32);
        Device tablet   = new Device("10.5\"", "Apple A14",       7600,  4);

        // Celular
        context.setStrategy(new Cellphone());
        context.showDevice(celular);

        // Notebook
        context.setStrategy(new Notebook());
        context.showDevice(notebook);

        // Desktop
        context.setStrategy(new Desktop());
        context.showDevice(desktop);

        // Tablet
        context.setStrategy(new Tablet());
        context.showDevice(tablet);
    }
}