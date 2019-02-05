package com.abrahambueno;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueWords {
    private String longString;
    ArrayList<String> strArr = new ArrayList<String>();
//    ArrayList<Dogs> dogsArrayList
    public static void main(String[] args) {

    }

    public void parseToString(String str) {
        String temporary = "";
        for (int i = 0; i <  str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '.' && str.charAt(i) != ',' ) {
                temporary += str.charAt(i);
            } else {
                if (temporary != "") {
                    System.out.println("adding: " + temporary);
                    strArr.add(temporary.toLowerCase());
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
                ", strArr=" + strArr +
                '}';
    }
}
