package com.home;

public class functions {
    public boolean isNum(String strNum){
        boolean ret = true;
        try {
            Float.parseFloat(strNum);
        } catch (NumberFormatException e) {
            ret = false;
        }
        return ret;
    }
}
