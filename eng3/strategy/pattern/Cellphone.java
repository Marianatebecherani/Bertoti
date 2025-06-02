
package pattern;

public class Cellphone implements IDevice {
    @Override
    public void showSpecifications(Device device) {
        System.out.println("=== Celular ===");
        System.out.println("Tela: " + device.getScreenSize());
        System.out.println("Processador: " + device.getProcessor());
        System.out.println("Bateria: " + device.getBatteryCapacity() + " mAh");
        System.out.println("Memória RAM: " + device.getMemory() + " GB");
        System.out.println("Exibindo interface móvel...\n");
    }
}