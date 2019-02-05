package com.abrahambueno;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueWords {
//    private String longString;
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
                    String[] newStr = new String[1];
                    newStr[0] = temporary;
                    System.out.println("adding: " + newStr[0].toString());
                    strArr.add(newStr[0].toString().toLowerCase());
                }
                temporary = "";
            }
        }
        System.out.println("This is the new array, with words only: " + strArr);
    }

    public ArrayList<String> getStrArr() {
        return strArr;
    }

    public void setStrArr(ArrayList<String> strArr) {
        this.strArr = strArr;
    }

    public UniqueWords(ArrayList<String> strArr) {
        this.strArr = strArr;
    }

    @Override
    public String toString() {
        return "UniqueWords{" +
                "strArr=" + strArr +
                '}';
    }
}
