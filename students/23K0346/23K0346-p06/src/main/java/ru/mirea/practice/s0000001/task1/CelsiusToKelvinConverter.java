package ru.mirea.practice.s0000001.task1;

public class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}

