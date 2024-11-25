package computer;

public class Computer implements Compute {
    //numbers based on gigabytes or cpu cores
    private int memory;
    private int storage;
    private int cpu;

    // DVC
    public Computer(){
        this.memory = 32;
        this.storage = 1_000;
        this.cpu = 8;
    }

    //EVC
    public Computer(int mem, int store, int cpu){
        this.memory = mem;
        this.storage = store;
        this.cpu = cpu;
    }

    // Setters
    public void setComputerMemory(int m){
        this.memory = m;
    }
    public void setComputerStorage(int s){
        this.storage = s;
    }
    public void setComputerCpu(int c){
        this.cpu = c;
    }

    //Getters
    public int getComputerMemory(){
        return this.memory;
    }
    public int getComputerStorage(){
        return this.storage;
    }
    public int getComputerCpu(){
        return this.cpu;
    }

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public String toString() {
        return String.format("This computer has " + this.memory + " gigs of memory, " + this.storage + " gigs of storage, and " + this.cpu + " cpu cores.");
    }

//    @Override
//    public int hashCode() {
//        return;
//    }
}
