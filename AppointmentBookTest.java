package com.wsu.cs;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentBookTest {
    private static Appointment a1, a2, a3, a4;

    @BeforeAll
    public static void setUp() {
        a1 = new Monthly(15, "pay the bills");
        a2 = new OneTime(2020, 11, 1, "Dentist appointment.");
        a3 = new Daily("Work on CS 242 material");
        a4 = new Monthly(10, "Visit Grandma");
    }

    @Test
    public void test_Monthly() {
        // Monthly is a subclass of Appointment
        assertTrue(Monthly.class.getSuperclass() == Appointment.class);
    }

    @Test
    public void test_Daily() {
        // Daily is a subclass of Appointment
        assertTrue(Daily.class.getSuperclass() == Appointment.class);
    }

    @Test
    public void test_OneTime() {
        // OneTime is a subclass of Appointment
        assertTrue(OneTime.class.getSuperclass() == Appointment.class);
    }

    @Test
    public void test_Monthly_Fields() {
        // Monthly class no extra fields
        assertEquals(Monthly.class.getDeclaredFields().length, 1);
    }

    @Test
    public void test_OneTime_Fields() {
        // OneTime class no extra fields
        assertEquals(OneTime.class.getDeclaredFields().length, 3);
    }

    @Test
    public void test_Daily_Fields() {
        // Daily class no extra fields
        assertEquals(Daily.class.getDeclaredFields().length, 0);
    }

    @Test
    public void test_Monthly2() {
        // 15th of every month we have to pay the bills
        assertTrue(a1.occursOn(2020, 9, 15));
        assertFalse(a1.occursOn(2020,  9,  10));
        // 10th of every month we visit grandma
        assertTrue(a4.occursOn(2020,  10,  10));
        assertFalse(a4.occursOn(2020,  11,  15));
    }

    @Test
    public void test_OneTime2() {
        // dentist appointment occurs only once
        assertTrue(a2.occursOn(2020, 11, 1));
        assertFalse(a2.occursOn(2020, 9, 23));
    }

    @Test
    public void test_Daily2() {
        // you better work on CS 242 every single day
        assertTrue(a3.occursOn(2020, 9, 25));
        assertTrue(a3.occursOn(2020, 12, 1));
    }


}
