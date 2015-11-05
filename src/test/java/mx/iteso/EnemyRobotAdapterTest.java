package mx.iteso;

import mx.iteso.adapter.enemy.EnemyRobot;
import mx.iteso.adapter.enemy.EnemyRobotAdapter;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * Created by Arreola on 11/4/2015.
 */
public class EnemyRobotAdapterTest {
    EnemyRobotAdapter enemyRobotAdapter;
    EnemyRobot enemyRobot;

    @Before
    public void setUp() {
        enemyRobot = mock(EnemyRobot.class);
        enemyRobotAdapter = new EnemyRobotAdapter(enemyRobot);
    }

    @Test
    public void fireWeaponTest() {
        assertEquals(true, enemyRobotAdapter.fireWeapon());
    }

    @Test
    public void driveForwardTest() {
        assertEquals(true, enemyRobotAdapter.driveForward());
    }

    @Test
    public void assignDriverTest() {
        assertEquals(true, enemyRobotAdapter.assignDriver("Fluttershy"));
    }
}
