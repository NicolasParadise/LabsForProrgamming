package by.bsu.circlePoint.Data;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CircleTest {

    Circle round;
    Point point;

    @BeforeClass
    public void setUp() throws NotNegativeException {
        round = new Circle(10,10,10);
        point = new Point(11,12);
    }

    @Test
    public void testDetermining() {
        int actuel = round.determining(point);
        int expected = 1;
        Assert.assertEquals(actuel,expected, 0.001,"Test failed as ...");
    }
}