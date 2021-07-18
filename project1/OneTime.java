
/* OneTime.java
   This class contains the set up to create Monthly Appointment objects
 */

package com.wsu.cs;
public class OneTime extends Appointment {

    private int Day;
    private int Month;
    private int Year;

    /*Class constructor, onetime takes three parameters
     * @param Year
     * @param Month
     * @param Day
     * @param Description
     */
    public OneTime(int Year, int Month, int Day, String Description) {
        super(Description);
        setDescription(Description);
        this.Year = Year;
        this.Month = Month;
        this.Day = Day;
    }

    /*
     * @param Year
     * @param Month
     * @param Day
     * @return

     This implementation of the method occursOn takes the day, month, and year values of a
     monthly appointment object and compares those values to the day, month, and year of
     a given date
     if the values equal, the method returns true. otherwise, it returns false.
     */
    @Override
    public boolean occursOn(int Year, int Month, int Day) {
        if (this.Year == Year && this.Month == Month && this.Day == Day) {
            return true;
        }
        return false;
    }

}
