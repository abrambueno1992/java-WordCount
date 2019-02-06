package com.abrahambueno;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueWords {
    private String longString;
    public static void main(String[] args) {

    }





    public String getLongString() {
        return longString;
    }

    public void setLongString(String longString) {
        this.longString = longString;
    }

    public UniqueWords( String longString) {
        this.longString = longString;

    }

    @Override
    public String toString() {
        return "UniqueWords{" +
                "longString='" + longString + '\'' +
                '}';
    }
}
