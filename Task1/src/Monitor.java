public class Monitor {
    double diagonal;
    TypeMonitor type;

    public double getDiagonal() {
        return diagonal;
    }

    public TypeMonitor getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    double weight;

    public Monitor(double diagonal, TypeMonitor type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nMonitor{" +
                "diagonal=" + diagonal +
                ", type=" + type +
                ", weight=" + weight +
                '}';
    }
}
