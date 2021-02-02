package com.home;

public class SystemPrint {
    public static boolean SystemPrint(String strNum) {
        boolean ret = true;
        try {
            Float.parseFloat(strNum);
        } catch (NumberFormatException e) {
            ret = false;
        }
        return ret;
    }
}
