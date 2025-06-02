
package antipattern;

public class DeviceDisplayer {
    public void showDevice(Device device) {
        switch (device.getType()) {
            case CELLPHONE:
                System.out.println("=== Celular ===");
                System.out.println("Tela: " + device.getScreenSize());
                System.out.println("Processador: " + device.getProcessor());
                System.out.println("Bateria: " + device.getBatteryCapacity() + " mAh");
                System.out.println("Memória RAM: " + device.getMemory() + " GB");
                System.out.println("Exibindo interface móvel...\n");
                break;

            case NOTEBOOK:
                System.out.println("=== Notebook ===");
                System.out.println("Tela: " + device.getScreenSize());
                System.out.println("Processador: " + device.getProcessor());
                System.out.println("Bateria: " + device.getBatteryCapacity() + " mAh");
                System.out.println("Memória RAM: " + device.getMemory() + " GB");
                System.out.println("Carregando drivers de laptop...\n");
                break;

            case DESKTOP:
                System.out.println("=== Desktop ===");
                System.out.println("Monitor: " + device.getScreenSize());
                System.out.println("Processador: " + device.getProcessor());
                System.out.println("Fonte de energia direta (sem bateria)");
                System.out.println("Memória RAM: " + device.getMemory() + " GB");
                System.out.println("Inicializando configuração de desktop...\n");
                break;

            case TABLET:
                System.out.println("=== Tablet ===");
                System.out.println("Tela: " + device.getScreenSize());
                System.out.println("Processador: " + device.getProcessor());
                System.out.println("Bateria: " + device.getBatteryCapacity() + " mAh");
                System.out.println("Memória RAM: " + device.getMemory() + " GB");
                System.out.println("Modo touch ativado...\n");
                break;

            default:
                System.out.println("Tipo de dispositivo não reconhecido.");
        }
    }
}
