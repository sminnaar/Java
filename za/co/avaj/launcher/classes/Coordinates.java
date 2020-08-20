package com.avaj.launcher.classes;

public int longitude;
public int latitude;
public int height;

public class Coordinates(int long, int lat, int height)
{
    this.longitude = long;
    this.latitude = lat;
    if (height > 100) {
        this.height = 100;
    }
    else
        this.height = height;
}

public int  getLongitude() {
    return this.longitude;
}

public int  getLatitude() {
    return this.latitude;
}

public int  getHeight() {
    return this.height;
}