package com.jike.weblog.entity;

import java.util.Objects;

public class DayPV {
    private String day;
    private String countpv;

    public DayPV() {
    }

    public DayPV(String day, String countpv) {
        this.day = day;
        this.countpv = countpv;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getCountpv() {
        return countpv;
    }

    public void setCountpv(String countpv) {
        this.countpv = countpv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayPV dayPV = (DayPV) o;
        return Objects.equals(day, dayPV.day) &&
                Objects.equals(countpv, dayPV.countpv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, countpv);
    }

    @Override
    public String toString() {
        return "DayPV{" +
                "day='" + day + '\'' +
                ", countpv='" + countpv + '\'' +
                '}';
    }
}
