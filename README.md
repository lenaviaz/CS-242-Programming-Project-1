## CS242 – Fall 2020

# Programming Project 1 – Inheritance and Runtime Polymorohism in Java

# Objective

The objective of this Programming Project is to apply the concept of inheritance and runtime Polymorphism in Java.  

### Program Description

Implement a superclass **Appointment** and subclasses **OneTime, Daily, and Monthly**. An Appointment has a description (for example “see the dentist”) and a date. Write a method:

**occursOn(int year, int month, int day)**

that checks whether the appointment occurs on that date. For example, for a monthly appointment, you must check whether the day of the month matches.
You must write following classes:

• Appointment.java
• Daily.java
• Monthly.java
• OneTime.java

You are provided with a  **JUnit5 test AppointmentTest.java**. Run your code with this file to make sure all the tests pass.
Once you complete the code and all your tests pass, you need to write **AppointmentBook.java file** – a skeleton and a sample run of the program is given to you. This file has a main method.
All of your java files should be inside **package com.wsu.cs** which is inside **src** subfolder, of your project

If you use **IntelliJ IDE**,  it will set up this way automatically for you.

**This project is intended to be done as an individual.**

### Hints for Programming and Testing

In order to do programming, looks at the tests in **AppointmentBookTest.java** and do Reverse Engineering:

1. What do you infer from following tests (and other similar tests)?:

   - assertTrue(Monthly.class.getSuperclass() == Appointment.class);

   - assertEquals(OneTime.class.getDeclaredFields().length, 3);

   - Similarly, what do you infer from tests for various occursOn() methods in **AppointmentBookTest.java**

2. After all tests pass, carefully study **Sample run of program**. Complete **AppointmentBook.java** accordingly.

3. Take help from the **UML diagram** of the final project as well.

### Deliverable

In order to submit your program, you will have to:

1. Fork Programming Project1 from [https://gitlab.com/worcester/cs/cs-242-01-02-03-fall-2020/cs-242-programming-project1](https://gitlab.com/worcester/cs/cs-242-01-02-03-fall-2020/cs-242-programming-project1) to your namespace.

2. Clone it to your local repository.

3. Commit and Push your  final repository to GitLab.

4. Make sure that you add the Instructor (snagpal) as the *Maintainer / Developer*.

### Due Date

Friday, September 18, 2020, End of Day.

## Copyright and License

#### &copy; 2020 S Nagpal, Worcester State University

**Credits: Aparna Mahadev**, Used with permission.

<img src="http://mirrors.creativecommons.org/presskit/buttons/88x31/png/by-sa.png" width=100px/>This work is licensed under the Creative Commons Attribution-ShareAlike 4.0 International License. To view a copy of this license, visit [http://creativecommons.org/licenses/by-sa/4.0/]() or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.
