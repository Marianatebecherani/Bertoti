
package antipattern;

public class Notebook extends Device {
    private final boolean hasDedicatedGPU;

    public Notebook(String screenSize, String processor, int batteryCapacity, int memory, boolean hasDedicatedGPU) {
        super(screenSize, processor, batteryCapacity, memory);
        this.hasDedicatedGPU = hasDedicatedGPU;
    }

    public boolean hasDedicatedGPU() {
        return hasDedicatedGPU;
    }

    @Override
    public DeviceType getType() {
        return DeviceType.NOTEBOOK;
    }
}
