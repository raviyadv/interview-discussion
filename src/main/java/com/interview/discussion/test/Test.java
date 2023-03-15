package com.interview.discussion.test;

public class Test {
    public static void main(String[] args) {
        String[] cities = {"delhi", "mumbai", "delhi", "pune", "gurgaon", "mumbai", "mumbai"};
    //    System.out.println(getHighestRepeatedCity(cities));
        System.out.println(getHighestRepeatedCityOptimized(cities));
    }

    private static String getHighestRepeatedCityOptimized(String[] cities) {
        int highestCount = 1;
        String highestCountCityName = "";
        for (int i = 0; i < cities.length; i++) {
            int count = 1;
            String cityName = cities[i];
            for (int j = i+1; j < cities.length; j++) {
                if (i == j)
                    continue;
                if (cityName.equalsIgnoreCase(cities[j]))
                    count++;
            }
            if (count > highestCount) {
                highestCount = count;
                highestCountCityName = cityName;
            }
        }
        return highestCountCityName;
    }
    private static String getHighestRepeatedCity(String[] cities) {
        int highestCount = 1;
        String highestCountCityName = "";
        for (int i = 0; i < cities.length; i++) {
            int count = 1;
            String cityName = cities[i];
            for (int j = 0; j < cities.length; j++) {
                if (i == j)
                    continue;
                if (cityName.equalsIgnoreCase(cities[j]))
                    count++;
            }
            if (count > highestCount) {
                highestCount = count;
                highestCountCityName = cityName;
            }
        }
        return highestCountCityName;
    }
}
