
package antipattern;

public abstract class Device {
    private final String screenSize;
    private final String processor;
    private final int batteryCapacity;
    private final int memory;

    public Device(String screenSize, String processor, int batteryCapacity, int memory) {
        this.screenSize = screenSize;
        this.processor = processor;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
    }

    public String getScreenSize()     { return screenSize;     }
    public String getProcessor()      { return processor;      }
    public int    getBatteryCapacity(){ return batteryCapacity;}
    public int    getMemory()         { return memory;         }

    public abstract DeviceType getType();
}
