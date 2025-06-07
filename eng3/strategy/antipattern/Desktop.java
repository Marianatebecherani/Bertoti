
package antipattern;

public class Desktop extends Device {
    private final String formFactor;

    public Desktop(String screenSize, String processor, int batteryCapacity, int memory, String formFactor) {
        super(screenSize, processor, batteryCapacity, memory);
        this.formFactor = formFactor;
    }

    public String getFormFactor() {
        return formFactor;
    }

    @Override
    public DeviceType getType() {
        return DeviceType.DESKTOP;
    }
}
