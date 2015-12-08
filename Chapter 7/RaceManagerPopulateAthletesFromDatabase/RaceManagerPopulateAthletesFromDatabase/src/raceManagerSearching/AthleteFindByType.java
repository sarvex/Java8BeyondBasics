package raceManagerSearching;

import java.io.Serializable;

import raceManagerObjects.Athlete;
import raceManagerObjects.Biker;
import raceManagerObjects.Runner;
import raceManagerObjects.Swimmer;

public class AthleteFindByType implements AthleteFinder, Serializable {

  private static final long serialVersionUID = -1655259693584698439L;
  private String _type;

  public AthleteFindByType(String type) {
    _type = type;
  }

  @Override
  public boolean searchForAthlete(Athlete searcher) {
    if (_type.equalsIgnoreCase("runner")) {
      return searcher instanceof Runner;
    } else if (_type.equalsIgnoreCase("swimmer")) {
      return searcher instanceof Swimmer;
    } else if (_type.equalsIgnoreCase("biker")) {
      return searcher instanceof Biker;
    }
    return false;
  }
}
