package raceManagerSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import raceManagerObjects.Athlete;

public class InfiniteSkillsRace implements Race {
  List<Athlete> racers;
  int nextRacerId;
  String name;
  double distance;
  String location;
  Athlete winner;

  /** Instantiate a race. */
  public InfiniteSkillsRace() {
    racers = new ArrayList<>();
    Random r = new Random();
    nextRacerId = r.nextInt(999999);
  }

  /** Get the name.
   *
   * @return String name of race. */
  @Override
  public String getName() {
    return name;
  }

  /** Set the name.
   *
   * @return the name of the race */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /** Get the distance.
   *
   * @return double representing distance. */
  @Override
  public double getDistance() {
    return distance;
  }

  /** Set the distance.
   *
   * @param distance double distance in km */
  @Override
  public void setDistance(double distance) {
    this.distance = distance;
  }

  /** Get the location.
   *
   * @return String location of race. */
  @Override
  public String getLocation() {
    return location;
  }

  /** Set the location.
   *
   * @param location of the race */
  @Override
  public void setLocation(String location) {
    this.location = location;
  }

  /** Get the winner.
   *
   * @return Athlete who won the race. */
  @Override
  public Athlete getWinner() {
    calculateWinner();
    return winner;
  }

  /** Calculate the winner. */
  private void calculateWinner() {
    Random r = new Random();
    int winnerIndex = r.nextInt(racers.size());
    winner = racers.get(winnerIndex);
  }

  /** Add a racer to the race. Set the racerid on add
   *
   * @param a the athlete to add
   * @return true if successful */
  @Override
  public boolean addRacer(Athlete a) {
    // clearly, there might be races with people that have
    // the same name in it. For simplicity, we'll ignore that
    // because we don't want to take the time to further limit objects
    // by age, city, and/or other factors.
    if (a == null)
      return false;
    if (a.getName() == null)
      return false;
    int racerIndex = findRacer(a.getName());
    if (racerIndex >= 0)
      return false;
    racers.add(a);
    a.setRacerId(nextRacerId++);
    return true;
  }

  /** Remove a racer from the race.
   *
   * @param a the athlete to remove */
  @Override
  public boolean removeRacer(String name) {
    if (name == null)
      return false;
    int racerPosition = findRacer(name);
    if (racerPosition < 0)
      return false;
    racers.remove(racerPosition);
    return true;
  }

  /** Get the current number of racers.
   *
   * @return number of registered racers */
  @Override
  public int getCurrentNumberOfRacers() {
    return racers.size();
  }

  /** Get a racer by name.
   *
   * @param name The name of the racer to find.
   * @return the athlete object by matching name. */
  @Override
  public Athlete getRacer(String name) {
    int index = findRacer(name);
    if (index < 0)
      return null;
    return racers.get(index);
  }

  /** Find a racer by name
   *
   * @param name of the racer to find
   * @return position of racer if exists */
  private int findRacer(String name) {
    if (name == null)
      return -1;
    for (int i = 0; i < racers.size(); i++) {
      Athlete a = racers.get(i);
      if (a.getName().equalsIgnoreCase(name)) {
        return i;
      }
    }
    return -1;
  }

  /** Get all the racers
   *
   * @return ArrayList<Athlete> the list of racers */
  @Override
  public Athlete[] getRacers() {
    if (racers.size() > 0) {
      Athlete[] racers = new Athlete[this.racers.size()];
      for (int i = 0; i < this.racers.size(); i++) {
        racers[i] = this.racers.get(i);
      }
      return racers;
    }
    return null;
  }
}
