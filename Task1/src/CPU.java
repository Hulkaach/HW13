public class CPU {
    CPUTact tact;
    Cores cores;
    Manufacturer manufacturer;
    double weght;

    public CPUTact getTact() {
        return tact;
    }

    public Cores getCores() {
        return cores;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getWeght() {
        return weght;
    }

    public CPU(CPUTact tact, Cores cores, Manufacturer manufacturer, double weght) {
        this.tact = tact;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weght = weght;
    }

    @Override
    public String toString() {
        return "\nCPU{" +
                "tact=" + tact +
                ", cores=" + cores +
                ", manufacturer=" + manufacturer +
                ", weght=" + weght +
                '}';
    }
}
