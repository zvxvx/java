package cscd210classes; // package statement


public class Clock{

   // fields
   private int hour;
   
   
   
   // constructors
   
   public Clock(){ // DVC
   
      this.hour = 12;
      // set minutes and seconds
   
   } // end constructor
   
   
   public Clock(int hour, int minute, int second){
   
      this.hour = hour;
      // fill out mins and secs
   
   
   } // end EVC
   
   
   
   // methods
   
   public int getHour(){
   
      return 0; // placeholder val
   
   
   } // end getHour
   
   /**
   * This method gets the current minutes value.
   * @return int the current minute setting for the Clock.
   */
   public int getMinutes(){
   
      return 0;
   
   } // end getMins
   
   
   public int getSeconds(){
   
      return 0;
   
   
   } // end getSeconds
   
   
   public void setHour(int hour){
   

   
   
   
   
   }
   
   
   public void setMinutes(int minute){
   

   
   
   } // setMins
   
   @Override
   public String toString(){
   
   
   
   }




} // end class