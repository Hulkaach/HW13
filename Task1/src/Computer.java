public class Computer {
    private CPU cpu;
    private DIMM dimm;
    private HardDrive hardDrive;
    private Monitor monitor;
    private Keyboard keyboard;
    final String vendor = "LG";
    final String name = "e398";

    public Computer(CPU cpu, DIMM dimm, HardDrive hardDrive, Monitor monitor, Keyboard keyboard) {
        this.cpu = cpu;
        this.dimm = dimm;
        this.hardDrive = hardDrive;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public double weightComputer() {
        return (this.cpu.getWeght() + this.dimm.getWeight() + this.hardDrive.getWeight() + this.monitor.getWeight() + this.keyboard.getWeight());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", dimm=" + dimm +
                ", hardDrive=" + hardDrive +
                ", monitor=" + monitor +
                ", keyboard=" + keyboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public CPU getCpu() {
        return cpu;
    }

    public DIMM getDimm() {
        return dimm;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setDimm(DIMM dimm) {
        this.dimm = dimm;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
