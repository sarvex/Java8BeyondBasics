package raceManagerSearching;

import java.io.Serializable;

import raceManagerObjects.Athlete;

public class AthleteFindByPartialName implements AthleteFinder, Serializable {
  private static final long serialVersionUID = 2883321742128534063L;
  private String _searchPhrase;

  public AthleteFindByPartialName(String searchPhrase) {
    _searchPhrase = searchPhrase;
  }

  @Override
  public boolean searchForAthlete(Athlete searcher) {
    String regexMatcher = String.format(".*%s.*", _searchPhrase);
    return searcher.getName().matches(regexMatcher);
  }
}
