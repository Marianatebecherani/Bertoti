
package pattern;

public class DeviceContext {
    private IDevice strategy;

    // Setter para injetar a estratégia
    public void setStrategy(IDevice strategy) {
        this.strategy = strategy;
    }

    // Executa o algoritmo através da interface
    public void showDevice(Device device) {
        if (strategy == null) {
            throw new IllegalStateException("Estratégia não definida!");
        }
        strategy.showSpecifications(device);
    }
}
