package cscd210classes; // package statement

public class Clock {

    // fields
    private int hour;
    private int minute;
    private int second;

    // constructors

    // When not defined, user is given a clock set at 12:00:00
    public Clock() {
        this.hour = 12;
        this.minute = 0;
        this.second = 0;
    }

    /**
     * Allows the user to create a clock with custom values for hours, minutes, and seconds.
     *
     * @param hour   Takes in a valid hour value.
     * @param minute Takes in a valid minute value.
     * @param second Takes in a valid secon value.
     * @throws IllegalArgumentException is thrown when invalid hour, minutes, seconds are inputted.
     */
    public Clock(final int hour, final int minute, final int second) {
        if (hour < 0 || hour > 12) {
            throw new IllegalArgumentException();
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException();
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // methods

    /**
     * This method gets the current hour value
     *
     * @return int Returns the current hour.
     */
    public int getHour() {
        return this.hour;
    }

    /**
     * This method gets the current minutes value.
     *
     * @return int Returns the current minutes.
     */
    public int getMinutes() {
        return this.minute;
    }

    /**
     * This method gets the current seconds value.
     *
     * @return int Returns the current seconds.
     */
    public int getSeconds() {
        return this.second;
    }

    /**
     * This method adds additional hours to the clock.
     *
     * @param hour is used to add to additional hours to the clock.
     * @throws IllegalArgumentException is thrown when inputting a negative hour value
     */
    public void setHour(final int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException();
        }
        this.hour = (this.hour + hour) % 12;
        if (this.hour == 0) {
            this.hour = 12;
        }
    }

    /**
     * This method adds additional minutes/hours to the clock.
     *
     * @param minute is used to add minutes to the clock and hours depending on the time.
     * @throws IllegalArgumentException is thrown when inputting a negative minute value
     */
    public void setMinutes(final int minute) {
        if (minute < 0) {
            throw new IllegalArgumentException();
        }
        int addHourByMinutes = this.hour + ((this.minute + minute) / 60);
        this.hour = addHourByMinutes % 12;
        this.minute = (this.minute + minute) % 60;
    }

    /**
     * toString() method designed for the Clock class.
     *
     * @return outputs a string in time format of HH:MM:SS.
     */
    @Override
    public String toString() {
        String timeString = "%02d:%02d:%02d";
        return String.format(timeString, this.hour, this.minute, this.second);
    }


} // end class