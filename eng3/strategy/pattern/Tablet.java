
package pattern;

public class Tablet implements IDevice {
    @Override
    public void showSpecifications(Device device) {
        System.out.println("=== Tablet ===");
        System.out.println("Tela: " + device.getScreenSize());
        System.out.println("Processador: " + device.getProcessor());
        System.out.println("Bateria: " + device.getBatteryCapacity() + " mAh");
        System.out.println("Memória RAM: " + device.getMemory() + " GB");
        System.out.println("Modo touch ativado...\n");
    }
}
