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
   public Clock(int hour,int minute,int second){
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
   public void setHour(int hour){
      this.hour = (this.hour + hour) % 12;
      if (this.hour == 0) {
         this.hour = 12;
      }
   }
   
   
   public void setMinutes(int minute){
       this.hour = (this.hour + (this.minute + minute) / 60) % 12;
       this.minute = ((this.minute + minute) % 60);
   }
   
   @Override
   public String toString(){
      String theString = "%02d:%02d:%02d";
      return String.format(theString, this.hour,this.minute,this.second);
   }




} // end class