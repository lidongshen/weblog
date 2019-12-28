package com.jike.weblog.entity;

import java.util.Objects;

public class MonthPV {
    private String month;
    private String count;

    @Override
    public String toString() {
        return "MonthPV{" +
                "month='" + month + '\'' +
                ", count='" + count + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonthPV monthPV = (MonthPV) o;
        return Objects.equals(month, monthPV.month) &&
                Objects.equals(count, monthPV.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, count);
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public MonthPV(String month, String count) {
        this.month = month;
        this.count = count;
    }

    public MonthPV() {
    }
}
