package com.emexo.Switch;

public class SwitchCaseExample {

    public String findDayOfWeek(String day) {
        String response;

        switch(day) {
            case "Monday":
                response = "Monday";
                break;

            case "Tuesday":
                response = "Tuesday";
                break;

            case "Friday":
                response = "Friday";
                break;

            default:
                response = day;
                break;
        }
        return  response.toString();
        }

    }

