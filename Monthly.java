
/* Monthly.java
   This class contains the set up to create Monthly Appointment objects
 */
package com.wsu.cs;
public class Monthly extends Appointment {

    private int Day;

    /* Class constructor, monthly appointments take two parameters
     * @param Day
     * @param Description
     */
    public Monthly(int Day, String Description) {
        super(Description);
        setDescription(Description);
        this.Day = Day;
    }

    /*
     * @param Year
     * @param Month
     * @param Day
     * @return true/false
      This implementation of the method will take the Day for a monthly appointment
      object and compare it's Day value with the day of a given date
      if the days equal it returns true, otherwise returns false
     */
    @Override
    public boolean occursOn(int Year, int Month, int Day) {
        if (this.Day == Day)
            return true;
        {
            return false;
        }
    }
}

