public class HardDrive {
    TypeHDD type;
    int volume;

    public TypeHDD getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    double weight;

    public HardDrive(TypeHDD type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nHardDrive{" +
                "type=" + type +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
