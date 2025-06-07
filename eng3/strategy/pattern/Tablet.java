
package pattern;

public class Tablet implements Device {
    private final String screenSize;
    private final String processor;
    private final int batteryCapacity;
    private final int memory;
    private final boolean supportsStylus;

    public Tablet(String screenSize, String processor, int batteryCapacity, int memory, boolean supportsStylus) {
        this.screenSize = screenSize;
        this.processor = processor;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
        this.supportsStylus = supportsStylus;
    }

    public boolean supportsStylus() {
        return supportsStylus;
    }

    @Override
    public String getScreenSize() {
        return screenSize;
    }

    @Override
    public String getProcessor() {
        return processor;
    }

    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public int getMemory() {
        return memory;
    }

    @Override
    public void showSpecifications() {
        System.out.println("=== Tablet ===");
        System.out.println("Tela: " + screenSize);
        System.out.println("Processador: " + processor);
        System.out.println("Bateria: " + batteryCapacity + " mAh");
        System.out.println("Memória RAM: " + memory + " GB");
        System.out.println("Caneta: " + (supportsStylus ? "Sim" : "Não"));
    }
}
