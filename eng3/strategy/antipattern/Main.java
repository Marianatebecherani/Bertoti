
package antipattern;

public class Main {
    public static void main(String[] args) {

        Cellphone phone = new Cellphone("6.5\"", "Snapdragon 8 Gen 3", 5000, 8, true);
        Notebook notebook = new Notebook("14\"", "Apple M2", 7000, 16, true);
        Desktop desktop = new Desktop("27\"", "Intel i9", 0, 32, "All-in-One");
        Tablet tablet = new Tablet("11\"", "Apple M1", 8000, 8, true);

        DeviceDisplayer displayer = new DeviceDisplayer();
        displayer.showDevice(phone);
        displayer.showDevice(notebook);
        displayer.showDevice(desktop);
        displayer.showDevice(tablet);
    }
}
