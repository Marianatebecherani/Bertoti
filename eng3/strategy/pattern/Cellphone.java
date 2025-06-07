
package pattern;

public class Cellphone implements Device {
    private final String screenSize;
    private final String processor;
    private final int batteryCapacity;
    private final int memory;
    private final boolean has5G;

    public Cellphone(String screenSize, String processor, int batteryCapacity, int memory, boolean has5G) {
        this.screenSize = screenSize;
        this.processor = processor;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
        this.has5G = has5G;
    }

    @Override
    public String getScreenSize() { return screenSize; }

    @Override
    public String getProcessor() { return processor; }

    @Override
    public int getBatteryCapacity() { return batteryCapacity; }

    @Override
    public int getMemory() { return memory; }

    @Override
    public void showSpecifications() {
        System.out.println("=== Celular ===");
        System.out.println("Tela: " + screenSize);
        System.out.println("Processador: " + processor);
        System.out.println("Bateria: " + batteryCapacity + " mAh");
        System.out.println("Memória RAM: " + memory + " GB");
        System.out.println("5G: " + (has5G ? "Sim" : "Não"));
    }
}
