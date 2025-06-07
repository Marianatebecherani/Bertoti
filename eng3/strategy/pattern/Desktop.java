
package pattern;

public class Desktop implements Device {
    private final String screenSize;
    private final String processor;
    private final int memory;
    private final String formFactor;

    public Desktop(String screenSize, String processor, int memory, String formFactor) {
        this.screenSize = screenSize;
        this.processor = processor;
        this.memory = memory;
        this.formFactor = formFactor;
    }

    public String getFormFactor() {
        return formFactor;
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
        return 0; // Desktops não têm bateria
    }

    @Override
    public int getMemory() {
        return memory;
    }

    @Override
    public void showSpecifications() {
        System.out.println("=== Desktop ===");
        System.out.println("Monitor: " + screenSize);
        System.out.println("Processador: " + processor);
        System.out.println("Memória RAM: " + memory + " GB");
        System.out.println("Formato: " + formFactor);
        System.out.println("Fonte de energia: direta (sem bateria)");
    }
}
