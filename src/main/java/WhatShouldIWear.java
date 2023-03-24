 import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {

        // Prompt user to input answer about the weather
        System.out.println("What is the weather like today? Is it sunny, rainy, cloudy or snowing? ");
        Scanner reader = new Scanner(System.in); // create option for answer
        String weather = reader.nextLine();


        if (weather.toLowerCase().contains("rainy")) {
            weather = "raining";
        }
        else if (weather.toLowerCase().contains("sunny")) {
            weather = "sunny";
        }
        else if (weather.toLowerCase().contains("snowing")) {
            weather = "snowing";
        }
        else {
            weather = "cloudy";
        }

        // Specify the weather "It is ..."
        System.out.println("It is " + weather + ".");


        // Determine the average temperature
        System.out.println("What is the weather's temperature in Celsius ? ");
        int temperature = reader.nextInt();

        String clothing;
        // Choose clothing based on the user's input about the temperature and weather
        if (weather.equalsIgnoreCase("raining")) {
            clothing = "waterproof jacket";
        }
        else if (weather.equalsIgnoreCase("sunny")) {
            clothing = "t-shirt and shorts";
        }
        else if (weather.equalsIgnoreCase("snowing")) {

            clothing = "winter coat";
        }
        else{
            clothing = "jumper and trousers";
        }

        String cloth_material;
        if (temperature < 10) {
            cloth_material = " thick ";
        }
        else if (temperature >=10 && temperature <=22) {
            cloth_material = " ";
        }
        else {
            cloth_material = " light ";
        }

        System.out.println("Wear a" + cloth_material + clothing);
    }
}