package mx.iteso;

import mx.iteso.adapter.temperature.CelsiusReporter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Arreola on 11/4/2015.
 */
public class CelsiusReporterTest {
    CelsiusReporter celsiusReporter;

    @Before
    public void setUp(){
        celsiusReporter = new CelsiusReporter();
    }

    @Test
    public void setAndGetTemperatureInCelsiusTest() {
        celsiusReporter.setTemperatureInCelsius(10);
        assertEquals(10, celsiusReporter.getTemperatureInCelsius(),0);
    }

}
