import com.avaj.launcher.classes;

import com.avaj.launcher.classes.Coordinates;
import com.avaj.launcher.singleton.WeatherProvider;

public String getWeather(Coordinates coordinates)
{
    return WeatherProvider
        .getProvider()
        .getCurrentWeather(coordinates);
}