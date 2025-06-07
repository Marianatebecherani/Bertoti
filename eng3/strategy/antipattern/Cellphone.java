
package antipattern;

public class Cellphone extends Device {
    private final boolean has5G;

    public Cellphone(String screenSize, String processor, int batteryCapacity, int memory, boolean has5G) {
        super(screenSize, processor, batteryCapacity, memory);
        this.has5G = has5G;
    }

    public boolean has5G() {
        return has5G;
    }

    @Override
    public DeviceType getType() {
        return DeviceType.CELLPHONE;
    }
}
