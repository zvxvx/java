package cscd210classes; // package statement


public class Clock{

   // fields
   private int hour;
   private int minute;
   private int second;


   
   // constructors

   // DVC
   public Clock(){
      this.hour = 12;
      this.minute = 0;
      this.second = 0;
   }

  // EVC
   public Clock(final int hour,final int minute,final int second){
       if ( hour < 0 || hour > 12 ) {
           throw new IllegalArgumentException();
       }
       if ( minute < 0 || minute > 59 ) {
           throw new IllegalArgumentException();
       }
       if ( second < 0 || second > 59 ) {
           throw new IllegalArgumentException();
       }
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }

   // methods

   /**
    * This method gets the current hour value
    * @return int the current hour.
    */
   public int getHour(){
      return this.hour;
   }
   
   /**
   * This method gets the current minutes value.
   * @return int the current minute setting for the Clock.
   */
   public int getMinutes(){
      return this.minute;
   }

   /**
    * This method gets the current seconds value.
    * @return int the current second setting for the Clock.
    */
   public int getSeconds(){
      return this.second;
   }

   /**
    * This method adds additional hours to the clock.
    * @param hour gives us an hour to add to the current hour
    */
   public void setHour(final int hour){
       if (hour < 0) {
           throw new IllegalArgumentException();
       }
      this.hour = (this.hour + hour) % 12;
      if (this.hour == 0) {
         this.hour = 12;
      }
   }
   
   
   public void setMinutes(final int minute){
       if (minute < 0) {
           throw new IllegalArgumentException();
       }
       int addHourByMinutes = this.hour + ((this.minute + minute) / 60);
       this.hour = addHourByMinutes % 12;
       this.minute = (this.minute + minute) % 60;
   }
   
   @Override
   public String toString(){
      String timeString = "%02d:%02d:%02d";
      return String.format(timeString, this.hour,this.minute,this.second);
   }




} // end class