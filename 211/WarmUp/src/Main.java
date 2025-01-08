public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer(32, 8, "PC");
        Computer mySecondComputer = new Computer();
        System.out.println(myComputer);
        System.out.println(myComputer.getBrand());
        System.out.println(mySecondComputer);
        ComputerComparator computerComparison =
                new ComputerComparator();
        System.out.println(computerComparison.compare(myComputer, mySecondComputer));
        System.out.println(mySecondComputer.compareTo(mySecondComputer));
    }
}
