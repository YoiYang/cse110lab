package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
       return this;
    }

    @Override
    public Temperature toFahrenheit() {
        double t = getValue() * 1.8 + 32;
        return new Fahrenheit((float) t);
    }

    public String toString()
    {
        // TODO: Complete this method

        return String.valueOf(getValue()) + " C";
    }
}