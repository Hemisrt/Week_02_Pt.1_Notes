package com.company.Greenlee;

public class Main {

    public static void main(String[] args) {
        int lowTemperature = 32;
        System.out.println(true | (lowTemperature += 5) > 0);
        System.out.println(lowTemperature);

        int currentTemperature = 3;
        int warmThreshold = 60;
        System.out.println(currentTemperature > warmThreshold
                ? "It's warm outside" : "It's cold outside");

        String windDirection = "";

        switch (windDirection) {
            case "north":
                System.out.println("The wind is blowing from the North.");
                break;
            case "south":
                System.out.println("The wind is blowing from the South.");
                break;
            case "east":
                System.out.println("The wind is blowing from the East.");
                break;
            case "west":
                System.out.println("The wind is blowing from the West.");
                break;
            default:
                System.out.println("I have no clue where the wind is blowing.");
                break;
        }

        int i = 0;
        for (; i <= 10;) {
            System.out.println(i + "*" + i + " = " + i * i);
            i++;
        }

        String[] words = {"hello", "how", "are", "you?"};
        System.out.println("Length of the 'words' array: " + words.length);
        for (int j = 0; j < words.length; j++) {
            System.out.println(words[j]);
        }
        for (String value:words) {
            System.out.println(value);
        }
    }
}
