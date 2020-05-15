package ru.geekbrains.converter;

public class ConvertToMeterPerSecond implements ConvertTo {

    @Override
    public float Do(float sourceValue) {
        return sourceValue/3.6F;
    }
}
