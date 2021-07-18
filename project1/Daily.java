
/* Daily.java
    This class contains the set up to create Daily Appointment objects

 */
package com.wsu.cs;
public class Daily extends Appointment {

    /* Class Constructor, daily appointments only take one parameter
     * @param Description
     */
    public Daily (String Description) {
        super(Description);
        setDescription(Description);
    }

    /*
     * @param Year
     * @param Month
     * @param Day
     * @return true
      Will only return true because a daily appointment would be true for any given date
     */

    @Override
    public boolean occursOn(int Year, int Month, int Day) {
        return true;

    }

}
