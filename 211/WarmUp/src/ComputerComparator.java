import java.util.Comparator;
public class ComputerComparator implements Comparator<Computer> {

    @Override
    public int compare(Computer c1, Computer c2) {
        if (c1.getRamCpu() < c2.getRamCpu()) {
            return -1;
        } else if (c1.getRamCpu() > c2.getRamCpu()) {
            return 1;
        }
        return 0;
    }
}
