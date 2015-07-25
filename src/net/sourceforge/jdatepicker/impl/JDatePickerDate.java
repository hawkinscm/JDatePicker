package net.sourceforge.jdatepicker.impl;

public class JDatePickerDate {
  private int year;
  private int month;
  private int day;

  public JDatePickerDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    JDatePickerDate that = (JDatePickerDate) o;
    return (this.year  == that.year &&
            this.month == that.month &&
            this.day   == that.day);
  }

  @Override
  public int hashCode() {
    return (year * 10000) + (month * 100) + day;
  }
}
