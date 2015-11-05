package mx.iteso;

import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Arreola on 11/4/2015.
 */
public class TemperatureClassReporterTest {
    TemperatureClassReporter temperatureClassReporter;

    @Before
    public void setUp() {
        temperatureClassReporter = new TemperatureClassReporter();
    }

    @Test
    public void getTemperatureInFahrenheitTest() {
        temperatureClassReporter.setTemperatureInCelsius(10);
        assertEquals(50, temperatureClassReporter.getTemperatureInFahrenheit(),0);
    }

    @Test
    public void getTemperatureInCelsiusTest() {
        temperatureClassReporter.setTemperatureInFahrenheit(50);
        assertEquals(10, temperatureClassReporter.getTemperatureInCelsius(), 0);
    }
}
