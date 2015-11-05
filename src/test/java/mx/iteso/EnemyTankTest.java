package mx.iteso;

import mx.iteso.adapter.enemy.impl.EnemyTank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Arreola on 11/4/2015.
 */
public class EnemyTankTest {
    EnemyTank enemyTank;

    @Before
    public void setUp() {
        enemyTank = new EnemyTank();
    }

    @Test
    public void fireWeaponTest() {
        assertEquals(true, enemyTank.fireWeapon());
    }

    @Test
    public void driveForwardTest() {
        assertEquals(true, enemyTank.driveForward());
    }

    @Test
    public void assignDriverTest() {
        assertEquals(true, enemyTank.assignDriver("Italo Ulloa"));
    }
}
