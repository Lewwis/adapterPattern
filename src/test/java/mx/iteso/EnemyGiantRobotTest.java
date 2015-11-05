package mx.iteso;

import mx.iteso.adapter.enemy.impl.EnemyGiantRobot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Arreola on 11/4/2015.
 */
public class EnemyGiantRobotTest {
    EnemyGiantRobot enemyGiantRobot;

    @Before
    public void setUp() {
        enemyGiantRobot = new EnemyGiantRobot();
    }

    @Test
    public void smashWithHandsTest() {
        assertEquals(true, enemyGiantRobot.smashWithHands());
    }

    @Test
    public void walkForwardTest() {
        assertEquals(true, enemyGiantRobot.walkForward());
    }

    @Test
    public void reactToHumanTest() {
        assertEquals(true, enemyGiantRobot.reactToHuman("Julio Cesar"));
    }
}
