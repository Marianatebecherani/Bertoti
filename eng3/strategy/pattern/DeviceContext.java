
package pattern;

public class DeviceContext {
    private Device strategy;

    // Setter para injetar a estratégia
    public void setStrategy(Device strategy) {
        this.strategy = strategy;
    }

    // Executa o algoritmo através da interface
    public void showDevice() {
        if (strategy == null) {
            throw new IllegalStateException("Estratégia não definida!");
        }
        strategy.showSpecifications();
    }
}
