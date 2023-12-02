public class Main {
    public static void main(String[] args) {
//        ArithmetricCalculator cal = new ArithmetricCalculator();
//        System.out.println(cal.calculate(2, 4, Operation.ADD));
//        System.out.println(cal.calculate(10, 16, Operation.MULTIPLY));
        CPU cpu1 = new CPU(CPUTact.LOW,Cores.FOR,Manufacturer.AOC,12.8);
        DIMM dimm1 = new DIMM(EnumDIMM.DIMM,16,0.1);
        Monitor monitor1 = new Monitor(17.3,TypeMonitor.TN,5.6);
        Keyboard keyboard1 = new Keyboard(TypeKeyboard.BLUTOOTH,TypeLight.NOTLIGHT,0.3);
        HardDrive hardDrive1 = new HardDrive(TypeHDD.HDD,256,0.2);
        Computer c1 = new Computer(cpu1,dimm1,hardDrive1,monitor1,keyboard1);
        System.out.println(c1.weightComputer());
        System.out.println(c1.toString());


    }
}