
package pattern;

public class Device {
    private final String screenSize;
    private final String processor;
    private final int batteryCapacity; // em mAh
    private final int memory;          // em GB

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
}