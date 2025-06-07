
package antipattern;

public class Tablet extends Device {
    private final boolean supportsStylus;

    public Tablet(String screenSize, String processor, int batteryCapacity, int memory, boolean supportsStylus) {
        super(screenSize, processor, batteryCapacity, memory);
        this.supportsStylus = supportsStylus;
    }

    public boolean supportsStylus() {
        return supportsStylus;
    }

    @Override
    public DeviceType getType() {
        return DeviceType.TABLET;
    }
}
