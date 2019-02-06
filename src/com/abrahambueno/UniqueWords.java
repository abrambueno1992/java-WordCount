package com.abrahambueno;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueWords {
    private String longString;
    private ArrayList<String> strArr = new ArrayList<String>();
//    ArrayList<Dogs> dogsArrayList
    public static void main(String[] args) {

    }



    public ArrayList<String> getStrArr() {
        return strArr;
    }

    public void setStrArr(ArrayList<String> strArr, String longString) {
        this.strArr = strArr;
        this.longString = longString;
    }

    public String getLongString() {
        return longString;
    }

    public void setLongString(String longString) {
        this.longString = longString;
    }

    public UniqueWords( String longString) {
        this.longString = longString;
//        this.strArr = strArr;
    }

    @Override
    public String toString() {
        return "UniqueWords{" +
                "strArr=" + strArr +
                '}';
    }
}
