public class Keyboard {
    TypeKeyboard typeKeyboard;
    TypeLight typeLight;
    double weight;

    public TypeKeyboard getTypeKeyboard() {
        return typeKeyboard;
    }

    public TypeLight getTypeLight() {
        return typeLight;
    }

    public double getWeight() {
        return weight;
    }

    public Keyboard(TypeKeyboard typeKeyboard, TypeLight typeLight, double weight) {
        this.typeKeyboard = typeKeyboard;
        this.typeLight = typeLight;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nKeyboard{" +
                "typeKeyboard=" + typeKeyboard +
                ", typeLight=" + typeLight +
                ", weight=" + weight +
                '}';
    }
}
