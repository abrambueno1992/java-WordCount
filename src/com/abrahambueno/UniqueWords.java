package com.abrahambueno;

import java.util.Arrays;

public class UniqueWords {
    private String longString;
    private String[] strArr;

    public static void main(String[] args) {

    }

    public UniqueWords(String longString) {
        this.longString = longString;
    }

    public String getLongString() {
        return longString;
    }

    public void setLongString(String longString) {
        this.longString = longString;
    }

    @Override
    public String toString() {
        return "UniqueWords{" +
                "longString='" + longString + '\'' +
                ", strArr=" + Arrays.toString(strArr) +
                '}';
    }
}
