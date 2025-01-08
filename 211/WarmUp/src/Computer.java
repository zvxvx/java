public class Computer implements ComputerInterface, Comparable<Computer> {
    private final int ram;
    private final int cpu;
    private final String brand;

    public Computer() {
        this.ram = 16;
        this.cpu = 4;
        this.brand = "Mac";
    }

    public Computer(int ram, int cpu, String brand) {
        this.ram = ram;
        this.cpu = cpu;
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getRamCpu() {
        return this.ram + this.cpu;
    }

    @Override
    public String toString() {
        return "I have " + this.ram + " GB of ram, " + this.cpu + " cpu " +
                "cores," +
                " and I am a " + this.brand;
    }

    @Override
    public String sayHi() {
        return "Hello, friend";
    }

    @Override
    public int compareTo(Computer o) {
        if (this.getRamCpu() < o.getRamCpu()) {
            return -1;
        } else if (this.getRamCpu() > o.getRamCpu()) {
            return 1;
        }
        return 0;
    }
}
