package com.emexo.Switch;

public class SwitchcaseExample1 {

    public String findDayOfMonth(String month){

        String res;

        switch (month) {
            case "January":
                res = "January";
                break;

            case "September":
                res = "September";
                break;

            case "December":
                res = "December";
                break;

            default:
                res = month;
                break;
        }
        return res;
        }
    }

