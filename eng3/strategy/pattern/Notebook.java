
package pattern;

public class Notebook implements IDevice {
    @Override
    public void showSpecifications(Device device) {
        System.out.println("=== Notebook ===");
        System.out.println("Tela: " + device.getScreenSize());
        System.out.println("Processador: " + device.getProcessor());
        System.out.println("Bateria: " + device.getBatteryCapacity() + " mAh");
        System.out.println("Memória RAM: " + device.getMemory() + " GB");
        System.out.println("Carregando drivers de laptop...\n");
    }
}
