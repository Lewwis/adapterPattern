package mx.iteso;

import mx.iteso.adapter.temperature.adapters.TemperatureObjectReporter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Arreola on 11/4/2015.
 */
public class TemperatureObjectReporterTest {
    TemperatureObjectReporter temperatureObjectReporter;

    @Before
    public void setUp() {
        temperatureObjectReporter = new TemperatureObjectReporter();
    }

    @Test
    public void getTemperatureInFahrenheitTest() {
        temperatureObjectReporter.setTemperatureInCelsius(10);
        assertEquals(50, temperatureObjectReporter.getTemperatureInFahrenheit(),0);
    }

    @Test
    public void getTemperatureInCelsius() {
        temperatureObjectReporter.setTemperatureInFahrenheit(50);
        assertEquals(10, temperatureObjectReporter.getTemperatureInCelsius(), 0);
    }
}
