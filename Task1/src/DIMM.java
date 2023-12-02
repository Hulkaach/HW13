public class DIMM {
    EnumDIMM dimm;
    int volume;
    double weight;

    public EnumDIMM getDimm() {
        return dimm;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public DIMM(EnumDIMM dimm, int volume, double weight) {
        this.dimm = dimm;
        this.volume = volume;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nDIMM{" +
                "dimm=" + dimm +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
