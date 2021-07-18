
/* Appointment.java
  Super class to subclasses Daily.java, Monthly.java, and OneTime.java
  This is a java class that initializes methods to be used in other subclasses and the driver code

 */
package com.wsu.cs;
public abstract class Appointment {

    private String Description;

    /*
     * Class constructor creates the blueprint for any Appointment object
     * @param Description
     */
    public Appointment(String Description) {
        this.Description = Description;
    }

    /*
     * @param Year
     * @param Month
     * @param Day
     * method that is on any object of type daily, monthly, or onetime to compare
        it to another date in the format of year, month, day
     */
    public abstract boolean occursOn(int Year, int Month, int Day);

    /*
     * @param Description
     * allows other subclasses to set a name for the private field description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /*
     * @return Description
     * method that returns the description of any appointment
     **/
    public String toString() {
        return Description;
    }

}

