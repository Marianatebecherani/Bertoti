
package antipattern;

public class Main {
    public static void main(String[] args) {
        Device celular  = new Device("6.1\"",  "Snapdragon 888", 4500,  8, DeviceType.CELLPHONE);
        Device notebook = new Device("15.6\"", "Intel i7",       6000, 16, DeviceType.NOTEBOOK);
        Device desktop  = new Device("27\"",   "AMD Ryzen 9",       0, 32, DeviceType.DESKTOP);
        Device tablet   = new Device("10.5\"", "Apple A14",       7600,  4, DeviceType.TABLET);

        DeviceDisplayer displayer = new DeviceDisplayer();
        displayer.showDevice(celular);
        displayer.showDevice(notebook);
        displayer.showDevice(desktop);
        displayer.showDevice(tablet);
    }
}
