package com.avaj.launcher.singleton;

import com.avaj.launcher.classes.Coordinates;
import java.util.Random;

public final class WeatherProvider
{
    public static String[] weather = {"RAIN", "FOG", "SUN", "SNOW"}
    private static WeatherProvider watherprovider = null;

    private WeatherProvider(){}

    public static WeatherProvider getProvider()
    {
        if (weatherprovider == null)
            weatherprovider = new WeatherProvider();
        return watherprovider;
    }

    public String getCurrentWeather(Coordinates coordinates)
    {
        int longitude = coordinates.getLongitude();
        int latitude = coordinates.getLatitude();
        int height = coordinates.getHeight();

        Random seed = new Random();
        int r = seed.nextInt(4);
        return (weather[r]);
    }
}