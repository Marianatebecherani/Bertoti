package mvc;

public class DogBreed {
    private String name;
    private String size;          // porte: mini, pequeno, médio, grande, gigante
    private String coatLength;    // pelagem: sem pelo, raso, curto, semilongo, longo
    private String coatTexture;   // pelagem: duro, heterogêneo, liso, sedoso, lanoso
    private String color;         // cor
    private String temperament;   // temperamento
    private String function;      // função: pastoreio, guarda, farejador, caça, guia...

    public DogBreed(
        String name,
        String size,
        String coatLength,
        String coatTexture,
        String color,
        String temperament,
        String function
    ) {
        this.name = name;
        this.size = size;
        this.coatLength = coatLength;
        this.coatTexture = coatTexture;
        this.color = color;
        this.temperament = temperament;
        this.function = function;
    }

    // Getters e Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public String getCoatLength() { return coatLength; }
    public void setCoatLength(String coatLength) { this.coatLength = coatLength; }

    public String getCoatTexture() { return coatTexture; }
    public void setCoatTexture(String coatTexture) { this.coatTexture = coatTexture; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getTemperament() { return temperament; }
    public void setTemperament(String temperament) { this.temperament = temperament; }

    public String getFunction() { return function; }
    public void setFunction(String function) { this.function = function; }
}
