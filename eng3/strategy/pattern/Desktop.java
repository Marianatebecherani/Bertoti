
package pattern;

public class Desktop implements IDevice {
    @Override
    public void showSpecifications(Device device) {
        System.out.println("=== Desktop ===");
        System.out.println("Monitor: " + device.getScreenSize());
        System.out.println("Processador: " + device.getProcessor());
        System.out.println("Fonte de energia direta (sem bateria)");
        System.out.println("Memória RAM: " + device.getMemory() + " GB");
        System.out.println("Inicializando configuração de desktop...\n");
    }
}

