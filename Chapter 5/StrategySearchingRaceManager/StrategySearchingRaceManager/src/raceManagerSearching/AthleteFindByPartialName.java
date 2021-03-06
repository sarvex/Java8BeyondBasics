package raceManagerSearching;

import raceManagerObjects.Athlete;

public class AthleteFindByPartialName implements AthleteFinder {
	private String _searchPhrase;
	
	public AthleteFindByPartialName(String searchPhrase)
	{
		_searchPhrase = searchPhrase;
	}
	
	@Override
	public boolean searchForAthlete(Athlete searcher) 
	{
		String regexMatcher = String.format(".*%s.*"
								, _searchPhrase);
		return searcher.getName().matches(regexMatcher);
	}
}
