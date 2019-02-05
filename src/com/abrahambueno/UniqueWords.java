package com.abrahambueno;

import java.util.Arrays;

public class UniqueWords {
    private String longString;
    private String[] strArr;

    public static void main(String[] args) {

    }

    public void parseToString(String str) {
        String temporary = "";
        for (int i = 0; i <  str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '.' && str.charAt(i) != ',' ) {
                temporary += str.charAt(i);
            } else {
                if (temporary != "") {
                    strArr.add(temporary);
                }
                temporary = "";
            }
        }
        System.out.println("This is the new array, with words only: " + strArr);
    }

    public UniqueWords(String longString) {
        this.longString = longString;
        parseToString(longString);
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
