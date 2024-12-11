import java.text.DecimalFormat;
import java.util.Scanner;

public class CSCD210MathLab {
    /* Vars designated as Strings instead of doubles are due to me formatting the expression when assigning values.
    The makes it easier to read the println statements containing the data requested. */
    public static double metersPerSecond;
    public static String feetPerSecond;
    public static String kilometersPerHour;
    public static String milesPerHour;
    public static String timeToSkiOneMileMinutes;
    public static String timeToSkiOneMileSeconds;
    public static String timeToSki100YardsSeconds;
    public static final double RACE_LENGTH_M = 2500;
    public static final double ONE_MILE = 1609.334;
    public static final double HUNDRED_YARDS = 91.44;
    public static final double RACE_LENGTH_F = RACE_LENGTH_M / 0.3048;
    public static final double RACE_LENGTH_KM = RACE_LENGTH_M / 1000;
    public static final double RACE_LENGTH_MI = RACE_LENGTH_M / ONE_MILE;
    public static void main(String[] args) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        DecimalFormat minutes = new DecimalFormat("0");
        /* Minutes become inaccurate when formatting without decimal, so to keep it from rounding up automatically,
        I changed the rounding mode to round down. */
        minutes.setRoundingMode(java.math.RoundingMode.DOWN);
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the skier’s name: ");
        String name = input.next();
        System.out.print("Please enter the winning time of the race: ");
        double raceTimeSeconds = input.nextDouble();
        double raceTimeHours = raceTimeSeconds / 3600;
        metersPerSecond = RACE_LENGTH_M / raceTimeSeconds;
        feetPerSecond = fmt.format(RACE_LENGTH_F / raceTimeSeconds);
        kilometersPerHour = fmt.format(RACE_LENGTH_KM / raceTimeHours);
        milesPerHour = fmt.format(RACE_LENGTH_MI / raceTimeHours);
        timeToSkiOneMileMinutes = minutes.format((ONE_MILE / metersPerSecond) / 60);
        timeToSkiOneMileSeconds = fmt.format((ONE_MILE / metersPerSecond) % 60);
        timeToSki100YardsSeconds = fmt.format(HUNDRED_YARDS / metersPerSecond);
        // Print out the data calculated by the expressions made above.
        System.out.println(name + " was traveling at a rate of:");
        System.out.println(fmt.format(metersPerSecond) + " meters per second");
        System.out.println(feetPerSecond + " feet per second");
        System.out.println(kilometersPerHour + " kilometers per hour");
        System.out.println(milesPerHour + " miles per hour");
        System.out.println("It would take " + timeToSkiOneMileMinutes + " minutes and " + timeToSkiOneMileSeconds +
                " seconds for " + name + " to ski one mile.");
        System.out.println("It would take " + timeToSki100YardsSeconds + " seconds for " + name + " to ski 100 yards.");
    }
}