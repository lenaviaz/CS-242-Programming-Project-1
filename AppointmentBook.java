
/* AppointmentBook.java
  @author Lena Viazmitinov       9/16/20       CS-242   Project1
 * Driver class for Project1

  All appointment objects (Daily, Monthly, and OneTime) are stored in an ArrayList.
  This program will prompt the user to either add an appointment or find an appointment.

 */
package com.wsu.cs;
import java.util.ArrayList;
import java.util.Scanner;

public class AppointmentBook {

    ArrayList<Appointment> Appointments = new ArrayList<>();

    /*
     * @param in
     If an appointment is added, the addAppointment method distinguishes what type of appointment it is.
     Using a scanner the method will save the data entered by the user and will save it as type
     daily, monthly, or onetime. After the data is allocated, an object of that type is created
     and added to the arraylist.

     */
    public void addAppointment(Scanner in) {
        System.out.print("Enter type [(D)aily, (M)onthly, (O)netime] and description:");
        String AddChoice = in.nextLine();
        char ch1 = AddChoice.charAt(0); //saves first letter entered by user which tells the program what type of appointment it is
        String Des = AddChoice.substring(2);// saves the second portion of what is entered by the user and saves it in string Description

        if (ch1 == 'D' || ch1 == 'd') {
            Daily d1 = new Daily(Des);
            Appointments.add(d1);

        }
        if (ch1 == 'M' || ch1 == 'm') {
            System.out.print("Enter the day of the appointment: ");
            int day = in.nextInt();
            Monthly m1 = new Monthly(day, Des);
            Appointments.add(m1);
        }
        if (ch1 == 'O' || ch1 == 'o') {
            System.out.print("Enter the date of the appointment (mm dd yyyy) :");
            int Month = in.nextInt();
            int Day = in.nextInt();
            int Year = in.nextInt();

            OneTime o1 = new OneTime(Year, Month, Day, Des);
            Appointments.add(o1);
        }
    }

    /*
     * @param in
     * The method findAppointments prompts the user to enter a date (mm dd yy).
       it saves each component of the date as month, day, and year then loops through
       the Appointments arraylist and calls the method OccursOn to compare values
       if the values are the same, the method description is displayed with the
       toString method.
     */
    public void findAppointments(Scanner in) {
        System.out.print("Enter the date (mm, dd, yyyy) to search:");
        int Month = in.nextInt();
        int Day = in.nextInt();
        int Year = in.nextInt();


        for (int i = 0; i < Appointments.size(); i++) {
            if (Appointments.get(i).occursOn(Year, Month, Day)) {
                System.out.print(Appointments.get(i).toString() + "\n");
            }
        }
    }

    /*
     * @param args
      Main method of the class
     */
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            AppointmentBook ab = new AppointmentBook();

            System.out.println("Welcome to the Appointment Book");
            System.out.println("-------------------------------");

            boolean done = false;
            while (!done) {
                System.out.print("Appointments: (F)ind, (A)dd, or (Q)uit: ");
                String choice = in.next();
                if (choice.equals("F") || choice.equals("f")) {
                    ab.findAppointments(new Scanner(System.in));
                } else if (choice.equals("A") || choice.equals("a")) {
                    ab.addAppointment(new Scanner(System.in));
                }
                done = choice.equals("Q") || choice.equals("q");
            }
            System.out.println("Good bye.  Have a nice day!");
            in.close();
        }

    }

}
