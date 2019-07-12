/*
 Implement a Java method that prints out the day of the week for a given day (1. . . 31),
month (1 . . . 12) and year in the range of March 1900 to February 2100.
Calculate the day of the week for the dates between March 1900 and February 2100 as follows:
First, you have to calculate the total number of days from 1900/1/1 to the given date (see below for
details).
Secondly, you divide this number by 7 with an integer remainder: This now is the day of the week,
with 0 as Sunday, 1 as Monday, and so on.
To calculate the total number of days, you have to implement the following steps:
• Subtract 1900 from the given year, and multiply the result by 365
• Add the missing leap years by adding (year − 1900) / 4.
Computer Science 268: Introduction to Programming in Java Page 7 of 12
• If the year itself is a leap year and the month is January or February, you have to subtract 1 from
the previous result.
• Now add all the days of the months of the given year to the result (in the case of February, it is
always 28 because the additional day for a leap year has already been added in the calculation).
 */

public class Question6 {

    public static void main(String[] args) {

    }
}
