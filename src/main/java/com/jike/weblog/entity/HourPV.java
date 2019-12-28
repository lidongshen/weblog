package com.jike.weblog.entity;


import java.util.Objects;

public class HourPV {
    private String hour;
    private String countpv;

    public HourPV(String hour, String countpv) {
        this.hour = hour;
        this.countpv = countpv;
    }

    public HourPV() {
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
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
        HourPV that = (HourPV) o;
        return Objects.equals(hour, that.hour) &&
                Objects.equals(countpv, that.countpv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, countpv);
    }

    @Override
    public String toString() {
        return "PVHourBean{" +
                "hour='" + hour + '\'' +
                ", countpv='" + countpv + '\'' +
                '}';
    }
}
