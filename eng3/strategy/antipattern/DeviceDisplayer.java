
package antipattern;

public class DeviceDisplayer {
    public void showDevice(Device device) {
        System.out.println("=== " + device.getType() + " ===");
        System.out.println("Tela: " + device.getScreenSize());
        System.out.println("Processador: " + device.getProcessor());
        System.out.println("Memória RAM: " + device.getMemory() + " GB");

        if (device.getBatteryCapacity() > 0) {
            System.out.println("Bateria: " + device.getBatteryCapacity() + " mAh");
        } else {
            System.out.println("Fonte de energia direta (sem bateria)");
        }

        // Verifica o tipo específico do dispositivo
        switch (device.getType()) {
            case CELLPHONE:
                Cellphone phone = (Cellphone) device;
                System.out.println("Suporte a 5G: " + (phone.has5G() ? "Sim" : "Não"));
                System.out.println("Exibindo interface móvel...\n");
                break;

            case NOTEBOOK:
                Notebook notebook = (Notebook) device;
                System.out.println("GPU dedicada: " + (notebook.hasDedicatedGPU() ? "Sim" : "Não"));
                System.out.println("Carregando drivers de laptop...\n");
                break;

            case DESKTOP:
                Desktop desktop = (Desktop) device;
                System.out.println("Formato: " + desktop.getFormFactor());
                System.out.println("Inicializando configuração de desktop...\n");
                break;

            case TABLET:
                Tablet tablet = (Tablet) device;
                System.out.println("Suporte a caneta: " + (tablet.supportsStylus() ? "Sim" : "Não"));
                System.out.println("Modo touch ativado...\n");
                break;

            default:
                System.out.println("Tipo de dispositivo não reconhecido.\n");
        }
    }
}
