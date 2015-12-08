package raceManagerObjects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunnerTest extends AthleteTest {
  private Runner r;
  private String raceActivity = "Running";
  private String shoes = "Any Shoe Brand";

  @Override
  public Athlete getAthlete() {
    return new Runner();
  }

  @Override
  public Athlete getExplicitAthlete() {
    return new Runner(name, age, racerId, shoes);
  }

  @Override
  @Before
  public void setUp() {
    r = new Runner();
  }

  @Override
  @After
  public void tearDown() {
    r = null;
  }

  @Override
  @Test
  public void testConstructors() {
    // leverage the overridden base class test.
    super.testConstructors();
    Runner r2 = new Runner(name, age, racerId, shoes);
    assertNotNull("Explicit Runner could not be created", r2);
    assertEquals("Shoes not set correctly on R2", shoes, r2.getShoeBrand());
  }

  @Test
  public void testGetSetShoeBrand() {
    r.setShoeBrand(shoes);
    assertEquals("The shoes could not be set as expected", shoes, r.getShoeBrand());
  }

  @Override
  @Test
  public void testPerformRaceActivity() {
    String pra = r.performRaceActivity();
    assertTrue("Perform race activity did not contain activity", pra.contains(raceActivity));
  }

  @Override
  @Test
  public void testToString() {
    // leverage the overridden base class test.
    super.testToString();

    // test local runner properties
    r.setName(name);
    r.setAge(age);
    r.setRacerId(racerId);
    r.setShoeBrand(shoes);
    String rts = r.toString();
    assertTrue("To String does not contain shoes", rts.contains(shoes));
    String rc = r.getClass().toString();
    assertTrue("To String does not contain class", rts.contains(rc));
    assertTrue("To string does not contain performRaceActivity", rts.contains(raceActivity));
  }
}
