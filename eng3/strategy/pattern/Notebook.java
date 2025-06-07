
package pattern;

public class Notebook implements Device {
    private final String screenSize;
    private final String processor;
    private final int batteryCapacity;
    private final int memory;
    private final boolean hasDedicatedGPU;

    public Notebook(String screenSize, String processor, int batteryCapacity, int memory, boolean hasDedicatedGPU) {
        this.screenSize = screenSize;
        this.processor = processor;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
        this.hasDedicatedGPU = hasDedicatedGPU;
    }

    public boolean hasDedicatedGPU() {
        return hasDedicatedGPU;
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
        System.out.println("=== Notebook ===");
        System.out.println("Tela: " + screenSize);
        System.out.println("Processador: " + processor);
        System.out.println("Bateria: " + batteryCapacity + " mAh");
        System.out.println("Memória RAM: " + memory + " GB");
        System.out.println("GPU dedicada: " + (hasDedicatedGPU ? "Sim" : "Não"));
    }
}
