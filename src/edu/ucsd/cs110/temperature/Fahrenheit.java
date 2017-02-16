package edu.ucsd.cs110.temperature;

/**
 * Created by Yash Ranjan on 2/15/2017.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = (int) ((((this.getValue()) - 32)*5)/9);
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() +" F";
    }
}
