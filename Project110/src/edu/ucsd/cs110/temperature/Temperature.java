package edu.ucsd.cs110.temperature;

/**
 * Created by Yash Ranjan on 2/15/2017.
 */
public abstract class Temperature {
    private float value;

    public Temperature(float v)
    {
        value = v;
    }
    public final float getValue()
    {
        return value;
    }
    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}
